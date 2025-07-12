package Models;

import java.util.ArrayList;

public class Book {
    public String title;
    public String ISBN;
    public Integer publicationYear;
    public ArrayList<Edition> editions = new ArrayList<>();
    public ArrayList<BorrowingHistory> borrowingHistory = new ArrayList<>();

    public Book(String title, String ISBN, Integer publicationYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.publicationYear = publicationYear;
    }
}
