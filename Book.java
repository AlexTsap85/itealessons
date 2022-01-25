package lection7;

import java.io.Serializable;

public class Book implements Serializable {
    private String bookName;
    private String author;
    private String publisher;
    private double price;

    public Book (String bookName, String author, String publisher, double price){
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
    public Book(){

    }
    public String getBookName(){
        return bookName;
    }
    public void setBookName(){
        this.bookName = bookName;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(){
        this.author = author;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(){
        this.publisher = publisher;
    }
    public double getPrice(double bookPrice){
        if (bookPrice<10)
            price = 10;


        return price;
    }

    public void setPrice(double bookPrice){
        if (bookPrice<10)
            System.out.println("ERROR: Price should be 10 or more!");
        price = 10;
        if (bookPrice>=10)
            this.price = bookPrice;
    }

    @Override
    public String toString(){
        return "Book: " +bookName+ " written by " +author+ ", published by " +publisher+ ". Price is " +price+ " UAH.";
    }

    public static void main(String[] args){
        Book book1 = new Book();
        book1.bookName = "The Great Gatsby electronic";
        book1.author = "F. Scott Fitzgerald";
        book1.publisher = "Charles Scribner's Sons";
        book1.setPrice(8);
        System.out.println(book1);
        System.out.println();

        Book book2 = new Book();
        book2.bookName = "The Great Gatsby in hard cover";
        book2.author = "F. Scott Fitzgerald";
        book2.publisher = "Charles Scribner's Sons";
        book2.setPrice(100);
        System.out.println(book2);

    }
}
