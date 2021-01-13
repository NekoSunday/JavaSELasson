package com.sunday.HomeWorkday05;

public class Homework08 {
    public static void main(String[] args) {
        Book book1=new Book("No0003","JavaWeb实战","isbn387648797524",58.8,"2017-01-01");
        Book book2=new Book("No0002","Java实战","isbn387648797525",55.8,"2017-01-03");
        Book book3=new Book("No0001","JavaScript实战","isbn387648797526",52.8,"2017-01-06");

        Book b=(book1.getPrice()>book2.getPrice()?(book1.getPrice()>book3.getPrice()?book1:book3):(book2.getPrice()>book3.getPrice()?book2:book3));

        b.showBook();
    }
}

