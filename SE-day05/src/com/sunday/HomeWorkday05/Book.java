package com.sunday.HomeWorkday05;

public class Book {
    private String bookNum;
    private String bookName;
    private String ISBNNum;
    private double price;
    private String date;

    public Book(){

    }

    public Book(String bookNum, String bookName, String ISBNNum, double price, String date){
        this.date = date;
        this.bookNum = bookNum;
        this.bookName = bookName;
        this.ISBNNum = ISBNNum;
        this.price = price;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setISBNNum(String ISBNNum) {
        this.ISBNNum = ISBNNum;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
}

    public String getBookNum() {
        return bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public String getISBNNum() {
        return ISBNNum;
    }

    public double getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public void showBook(){
        System.out.println("最贵的书是："+getBookNum()+","+getBookName()+","+getISBNNum()+","+getPrice()+","+getDate());
    }
}
