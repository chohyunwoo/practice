package exam1.exam4.book;

public class BookMain {

    public static void main(String[] args) {

        Book[] books = {
                new Book(),
                new Book("Hello Java", "Seo"),
                new Book("JPA 프로그래밍", "kim", 700)
        };

        for (Book book : books) {
            book.displayInfo();
        }
    }
}
