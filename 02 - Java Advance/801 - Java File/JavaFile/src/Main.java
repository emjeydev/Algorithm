import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Notebook notebook = new Notebook();
        notebook.writeToFile("Ali is here" + "\n" + "Is he");
        notebook.writeToFile("This is a notebook");
        String s = notebook.readFromFile();
        System.out.println(s);
        notebook.deleteFile();
    }
}