import Models.Author;
import Models.Book;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        manager.setLibraryName("Central Library");
        Author author = new Author("1", "J.K. Rowling");
        Book book = new Book("Harry Potter", "1234567890", 1997);
        author.books.add(book);
        manager.addAuthor(author);

        String json = manager.getLibraryAsJson();
        System.out.println(json);

        manager.loadLibraryFromJson(json);
        System.out.println("Loaded Library: " + manager.getLibraryName());
    }
}

