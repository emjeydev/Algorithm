import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Arrange
        var processor = new FileProcessor();
        var inputFile = "test_input.txt";
        var outputFile = "test_output.txt";

        Writer writer = new FileWriter(inputFile);
        writer.write("Hello, this is a test.");
        writer.close();

        // Act
        processor.processFile(inputFile, outputFile);

        // Assert
        String expectedOutput = "HELLO, THIS IS A TEST.";
        FileInputStream fis = new FileInputStream(outputFile);
        String actualOutput = new String(fis.readAllBytes());
        fis.close();

        System.out.println(actualOutput);
        System.out.println(expectedOutput);

        new File(outputFile).delete();
        new File(inputFile).delete();
    }
}