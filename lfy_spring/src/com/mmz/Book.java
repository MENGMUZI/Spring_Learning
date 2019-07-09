package com.mmz;

/**
 * @author : mengmuzi
 * create at:  2019-07-09  14:12
 * @description:
 */
public class Book {

    private String bookName;
    private String author;

    public Book(){
        System.out.println("Book Constructor...");
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
        System.out.println("Book Values Constructor ***** ");
    }

    public void bookInit(){
        System.out.println("this is book init method!!!!!!!!!!");

    }

    public void bookDestroy(){
        System.out.println("this is book destroy method!!!!!!!!!!");

    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
