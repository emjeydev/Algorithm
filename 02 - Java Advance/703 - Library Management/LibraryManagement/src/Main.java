import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            input = scanner.nextLine();
            String[] inoutArr = input.split(",");
            if (inoutArr[0].equals("1")) {
                books.add(new Book(inoutArr[1], inoutArr[2], Integer.parseInt(inoutArr[3])));
            } else if (input.equals("2")) {
                books.stream().sorted(Comparator.comparingInt(Book::getYear).reversed()).forEach(System.out::println);
            } else if (input.equals("3")) {
                books.stream().sorted(Comparator.comparingInt(Book::getYear)).forEach(System.out::println);
            } else if (inoutArr[0].equals("4")) {
                String authorNameInfo = inoutArr[1];
                books.stream().filter(f -> f.getAuthorName().contains(authorNameInfo)).forEach(System.out::println);
            } else if (inoutArr[0].equals("5")) {
                String bookNameInfo = inoutArr[1];
                books.stream().filter(f -> f.getBookName().contains(bookNameInfo)).forEach(System.out::println);
            } else if (inoutArr[0].equals("6")) {
                String author = inoutArr[1];
                long bookCount = books.stream().filter(f -> f.getAuthorName().equals(author)).count();
                System.out.println(bookCount);
            } else if (inoutArr[0].equals("7")) {
                int n = Integer.parseInt(inoutArr[1]);
                books.stream().limit(n).forEach(System.out::println);
            } else if (input.equals("8")) {
                books.stream().findFirst().ifPresent(System.out::println);
            } else if (input.equals("9")) {
                books.stream().reduce((first, second) -> second).ifPresent(System.out::println);
            }
        } while (!input.equals("0"));

        scanner.close();
    }
}

class Book {
    private String bookName;
    private String authorName;
    private int year;

    public Book(String bookName, String authorName, int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return bookName + " written by " + authorName + " in " + year;
    }
}