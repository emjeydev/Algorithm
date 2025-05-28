package org.example;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@CommandLine.Command(name = "task-manager", mixinStandardHelpOptions = true, version = "1.0",
        description = "A simple task manager to add, list, and complete tasks.")
public class TaskManager implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(TaskManager.class);
    private static final String FILE_NAME = "tasks.dat";
    static int nextId = 1;
    List<Task> tasks = new ArrayList<>();

    @CommandLine.Option(names = {"-a", "--add"}, description = "Add a new task")
    private String description;

    @CommandLine.Option(names = {"-l", "--list"}, description = "List all tasks")
    private boolean listTasks;

    @CommandLine.Option(names = {"-d", "--done"}, description = "Mark task as done")
    private Integer taskId;

    public void addTask(String description) {
        if (StringUtils.isBlank(description)) {
            System.out.println("Error: Task description cannot be empty.");
            return;
        }

        tasks.add(new Task(nextId++, description));
        System.out.println("Task added successfully.");
    }

    public void markTaskAsDone(int taskId) {
        if (taskId < 1)
            throw new IllegalArgumentException("Error: Invalid task ID.");
        try {
            findTaskById(taskId).markAsDone();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Task marked as done.");
    }

    public void listTasks() {
        loadTasksFromFile();
        tasks.forEach(System.out::println);
    }

    private void saveTasksToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            logger.error("Failed to save tasks to file", e);
        }
    }

    private void loadTasksFromFile() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                tasks = (List<Task>) ois.readObject();
                if (!tasks.isEmpty()) {
                    nextId = tasks.get(tasks.size() - 1).getId() + 1;
                }
            } catch (IOException | ClassNotFoundException e) {
                logger.error("Failed to load tasks from file", e);
            }
        }
    }

    private Task findTaskById(int id) throws ClassNotFoundException {
        return tasks.stream().filter(task -> task.getId() == id).findFirst().orElseThrow(() -> new ClassNotFoundException("Error: Invalid task ID."));
    }

    @Override
    public void run() {
        loadTasksFromFile();
        if (description != null) {
                addTask(description);
                saveTasksToFile();
        }
        if (listTasks)
            listTasks();
        if (taskId != null) {
            try {
                markTaskAsDone(taskId);
                saveTasksToFile();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
