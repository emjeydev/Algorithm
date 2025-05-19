import java.util.Arrays;

public class CsvServiceImpl implements CsvService {
    @Override
    public int getSum(String csvFile) {
        String[] lines = csvFile.split("\n");

        return Arrays.stream(lines).skip(1).map(Person::fromCsv).mapToInt(Person::getAge).sum();
    }
}
