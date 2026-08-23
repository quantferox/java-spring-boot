package tasks.other.book;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 128));
        books.add(new Book("Book2", 512));
        books.add(new Book("Book3", 1024));
        books.add(new Book("Book4", 256));
        books.add(new Book("Book5", 2048));
        books.add(new Book("Book6", 64));
        books.add(new Book("Book7", 32));
        books.add(new Book("Book8", 16));
        Collections.sort(books);
        System.out.println(books);
    }
}
