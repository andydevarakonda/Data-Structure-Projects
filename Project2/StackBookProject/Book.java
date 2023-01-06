
public class Book
{
    private String title;
    private String author;
    private double price;

    //constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    //setter methods
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String author) {
        this.author = author;
    }

    public void setQuantity(double price) {
        this.price = price;
    }

    //toString method, e.g. "2 bagel (bakery)"
    @Override
    public String toString() {
        return "Title of the book: "+ title +" Author of the book: " + author + " Price of the book: " + price;
    }
}
