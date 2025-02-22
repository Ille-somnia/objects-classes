import java.util.Objects;

public class Book {
   private final String title;
   private final Author author;
   private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1920 || publishingYear > 2025) {
            System.out.println("Invalid publishing year: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

}
