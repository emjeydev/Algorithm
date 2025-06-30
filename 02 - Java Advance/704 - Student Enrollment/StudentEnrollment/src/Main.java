import Models.Class;
import Models.Enrollment;
import Models.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Class> classList = new ArrayList<>();
        Class c1 = new Class();
        c1.setClassId(1);
        c1.setClassName("C1");
        classList.add(c1);
        Class c2 = new Class();
        c2.setClassId(2);
        c2.setClassName("C2");
        classList.add(c2);
        Class c3 = new Class();
        c3.setClassId(3);
        c3.setClassName("C3");
        classList.add(c3);

        List<Student> studentList = new ArrayList<>();
        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setStuNo(1);
        studentList.add(student);
        Student student1 = new Student();
        student1.setFirstName("Jane");
        student1.setLastName("Smith");
        student1.setStuNo(2);
        studentList.add(student1);
        Student student2 = new Student();
        student2.setFirstName("Jack");
        student2.setLastName("Richard");
        student2.setStuNo(3);
        studentList.add(student2);

        List<Enrollment> enrollmentList = new ArrayList<>();
        Enrollment enrollment = new Enrollment();
        enrollment.setClassId(1);
        enrollment.setStuNo(1);
        enrollment.setEnrollDate("Saturday");
        enrollmentList.add(enrollment);
        Enrollment enrollment1 = new Enrollment();
        enrollment1.setClassId(1);
        enrollment1.setStuNo(2);
        enrollment1.setEnrollDate("Saturday");
        enrollmentList.add(enrollment1);
        Enrollment enrollment3 = new Enrollment();
        enrollment3.setClassId(1);
        enrollment3.setStuNo(3);
        enrollment3.setEnrollDate("Saturday");
        enrollmentList.add(enrollment3);
        Enrollment enrollment4 = new Enrollment();
        enrollment4.setClassId(3);
        enrollment4.setStuNo(3);
        enrollment4.setEnrollDate("Saturday");
        enrollmentList.add(enrollment4);

        Calculate calculate = new Calculate();
        List<String> allClasses = calculate.countAllClasses(enrollmentList);
        System.out.println("All classes count: " + allClasses.size());
        allClasses.forEach(System.out::println);
        System.out.println("---------------------------------------------");
        int totalStudent = calculate.countClassStudents(enrollmentList, 1);
        System.out.println("Total number of students: " + totalStudent);
        System.out.println("----------------------------------------------");
        int totalClasses = calculate.countStudentClasses(enrollmentList, 3);
        System.out.println("Total number of classes: " + totalClasses);
        System.out.println("----------------------------------------------");
        System.out.println("Student Full Name");
        String studentFullName = calculate.getStudentFullName(studentList, 1);
        System.out.println(studentFullName);
        System.out.println("----------------------------------------------");
        List<String> studentClassNames = calculate.getStudentClassNames(classList, enrollmentList, 3);
        studentClassNames.forEach(System.out::println);
    }
}