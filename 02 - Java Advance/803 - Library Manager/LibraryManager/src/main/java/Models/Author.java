package Models;

import java.util.ArrayList;

public class Author {
    public String authorId;
    public String authorName;
    public ArrayList<Book> books = new ArrayList<>();

    public Author(String authorId, String authorName) {
        this.authorId = authorId;
        this.authorName = authorName;
    }
}
