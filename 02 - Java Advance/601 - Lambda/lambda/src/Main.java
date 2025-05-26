import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(12, 8, 15, 7, 19, 10);

        GradeProcessor processor = new GradeProcessor();

        System.out.println(processor.calculateAverage(grades));     // 11.83
        System.out.println(processor.findMaxGrade(grades));         // 19
        System.out.println(processor.filterPassingGrades(grades));  // [12, 15, 19, 10]
        System.out.println(processor.boostGrades(grades));          // [14, 10, 17, 9, 21, 12]
    }
}