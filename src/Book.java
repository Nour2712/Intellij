public class Book {


    final private String author;
    final private String title;
    final private String isbn;
    final private int id;

    public Book(String author, String title, String isbn, int id) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.id = id;
    }

    //del 8,3
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return author + "; " + title + "; isbn " + isbn;
    }


}
