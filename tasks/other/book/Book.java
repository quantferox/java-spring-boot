package tasks.other.book;

public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    @Override
    public int compareTo(Book book) {
        return Integer.compare(this.pageCount, book.pageCount);
    }

    @Override
    public String toString() {
        return this.title + "-" + this.pageCount + "-pages";
    }
}
