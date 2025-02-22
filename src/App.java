import java.util.Objects;

public class App {
    public static void main(String[] args) {
        System.out.println("library guide");

        Author author = new Author("Герберт", "Шилдт");
        Author author1 = new Author("Роберт", "Мартин");

        Book book = new Book("Java. Полное руководство", author, 2010);
        Book book1 = new Book("Чистый код", author1, 2017);

        System.out.println(book);

        System.out.println(book1);

        book.setPublishingYear(2022);

        System.out.println(book);

        System.out.println(book.getAuthor().equals(author));
        System.out.println(author1.equals(book1.getAuthor()));
    }
}
