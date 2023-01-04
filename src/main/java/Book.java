public class Book extends Product {
    private String author;

    public Book(int id, String name, int prise, String author) {
        super(id, name, prise);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
