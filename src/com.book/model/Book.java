package com;

public class Book {
    private int bookId;
    private String bookName;
    private String writerName;
    private double price;
    private int quantity;

    public Book(int bookId, String bookName, String writerName, double price, int quantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.writerName = writerName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", writerName='" + writerName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
