import Models.Class;
import Models.Enrollment;
import Models.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Calculate {

    public List<String> countAllClasses(List<Enrollment> enrollments) {
        return enrollments.stream()
                .collect(Collectors.groupingBy(Enrollment::getClassId, Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().thenComparing(Map.Entry.comparingByKey()))
                .map(enrollment -> enrollment.getKey() + ":" + enrollment.getValue())
                .collect(Collectors.toList());
    }

    public int countClassStudents(List<Enrollment> enrollments, int classId) {
        return (int) enrollments.stream()
                .filter(enrollment -> enrollment.getClassId() == classId)
                .count();
    }

    public int countStudentClasses(List<Enrollment> enrollments, int stdNo) {
        return (int) enrollments.stream()
                .filter(enrollment -> enrollment.getStuNo() == stdNo)
                .count();
    }

    public String getStudentFullName(List<Student> students, int stdNo) {
        return students.stream()
                .filter(student -> student.getStuNo() == stdNo)
                .map(student -> student.getFirstName() + " " + student.getLastName())
                .findFirst().orElse("");
    }

    public List<String> getStudentClassNames(List<Class> classes, List<Enrollment> enrollments, int stdNo) {
        List<Integer> classIdList = enrollments.stream()
                .filter(enrollment -> enrollment.getStuNo() == stdNo)
                .map(Enrollment::getClassId).toList();
        return classes.stream()
                .filter(f-> classIdList.contains(f.getClassId()))
                .sorted(Comparator.comparing(Class::getClassId))
                .map(Class::getClassName)
                .collect(Collectors.toList());
    }
}
