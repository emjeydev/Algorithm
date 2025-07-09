import java.io.*;

public class FileProcessor {

    public void processFile(String inputFile, String outputFile) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        processStreams(fileInputStream, fileOutputStream);
    }

    public void processStreams(FileInputStream inputStream, FileOutputStream outputStream) {
        try {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                String text = new String(buffer, 0, bytesRead);
                String processedText = processText(text);
                outputStream.write(processedText.getBytes());
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String processText(String input) {
        return input.toUpperCase();
    }

}
