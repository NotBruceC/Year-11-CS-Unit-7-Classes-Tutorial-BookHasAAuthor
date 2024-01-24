public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }



    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void setQuantity(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return  "\'" + name + "\'" + " by " + author.toString();
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int i) {
        qty = i;
    }

    public Object getName() {
        return  name;
    }
}
