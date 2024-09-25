
class Book {
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void print() {
        System.out.println(title);
        System.out.println( author);
        System.out.println( price);
    }
    private String title;
    private String author;
    private int price;
}




public class Bookname {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "나미야 잡하점";
        book.author = "히가시노게이고";
        book.price = 15000;

        book.print();
    }
}
