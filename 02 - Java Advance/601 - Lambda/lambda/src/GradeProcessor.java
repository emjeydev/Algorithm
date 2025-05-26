import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class GradeProcessor {
    public double calculateAverage(List<Integer> grades) {
        OptionalDouble average = grades.stream().mapToDouble(n -> n).average();
        return average.isPresent() ? average.getAsDouble() : 0;
    }

    public int findMaxGrade(List<Integer> grades) {
        return grades.stream().reduce(0, (a, b) -> a > b ? a : b);
    }

    public List<Integer> filterPassingGrades(List<Integer> grades) {
        return grades.stream().filter(n -> n >= 10).collect(Collectors.toList());
    }

    public List<Integer> boostGrades(List<Integer> grades) {
        return grades.stream().map(n -> n + 2).collect(Collectors.toList());
    }
}
