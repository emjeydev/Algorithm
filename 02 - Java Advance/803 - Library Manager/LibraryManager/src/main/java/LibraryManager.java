import Models.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;

public class LibraryManager {
    private Library _library = new Library();
    private final Gson gson = new Gson();

    public Library getLibrary() {
        return _library;
    }

    public void setLibraryName(String name) {
        _library.name = name;
    }

    public String getLibraryName() {
        return _library.name;
    }

    public void addAuthor(Author author) {
        _library.authors.add(author);
    }

    public void removeAuthor(String authorId) {
        _library.authors.removeIf(author -> author.authorId.equals(authorId));
    }

    public void addBookToAuthor(String authorId, Book book) {
        _library.authors.stream().
                filter(author -> author.authorId.equals(authorId))
                .findFirst()
                .ifPresent(author -> author.books.add(book));
    }

    public void removeBookFromAuthor(String authorId, String isbn) {
        _library.authors.stream()
                .filter(author -> author.authorId.equals(authorId))
                .findFirst()
                .ifPresent(author ->
                        author.books.removeIf(book -> book.ISBN.equals(isbn)));
    }

    public void addEditionToBook(String isbn, Edition edition) {
        _library.authors.stream()
                .flatMap(author -> author.books.stream())
                .filter(book -> book.ISBN.equals(isbn))
                .findFirst()
                .ifPresent(book -> book.editions.add(edition));
    }

    public void removeEditionFromBook(String isbn, String editionCode) {
        _library.authors.stream()
                .flatMap(author -> author.books.stream())
                .filter(book -> book.ISBN.equals(isbn))
                .findFirst()
                .ifPresent(book ->
                        book.editions.removeIf(edition -> edition.code.equals(editionCode)));
    }

    public void borrowBook(String isbn, BorrowingHistory borrowingHistory) {
        _library.authors.stream()
                .flatMap(author -> author.books.stream())
                .filter(book -> book.ISBN.equals(isbn))
                .findFirst()
                .ifPresent(book -> book.borrowingHistory.add(borrowingHistory));
    }

    public void returnBook(String isbn, String browseId) {
        _library.authors.stream()
                .flatMap(author -> author.books.stream())
                .filter(book -> book.ISBN.equals(isbn))
                .findFirst()
                .flatMap(book -> book.borrowingHistory.stream()
                        .filter(borrowingHistory -> borrowingHistory.borrowerId.equals(browseId))
                        .findFirst()).ifPresent(borrowingHistory -> borrowingHistory.isReturned = true);
    }

    public String getLibraryAsJson() {
        return gson.toJson(_library);
    }

    public void loadLibraryFromJson(String json) {
        try {
            Library library = gson.fromJson(json, Library.class);
            if (library != null) {
                this._library = library;
            }
        } catch (JsonSyntaxException e) {
            System.err.println("Failed to parse JSON: " + e.getMessage());
        }
    }
}
