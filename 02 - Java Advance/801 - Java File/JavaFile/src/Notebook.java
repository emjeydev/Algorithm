import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Notebook {

    File file = new File("notebook.txt");

    public void writeToFile(String text) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }

        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(text);
        }
    }

    public String readFromFile() throws IOException {
        if (!file.exists())
            return null;

        Scanner scanner = new Scanner(file);
        StringBuilder text = new StringBuilder();
        while (scanner.hasNextLine()) {
            text.append(scanner.nextLine());
            if (scanner.hasNextLine()) {
                text.append(System.lineSeparator());
            }
        }
        scanner.close();
        return text.toString();
    }

    public boolean deleteFile() {
        if (!file.exists())
            return false;

        return file.delete();
    }

}