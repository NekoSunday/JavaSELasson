package com.sunday.HomeWorkday06;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork08 {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner index=setBook();
            System.out.println("请输入第"+(i+1)+"本书的书名：");
            String nameIndex=index.next();

            System.out.println("请输入第"+(i+1)+"本书的isbn：");
            String isbnIndex=index.next();

            System.out.println("请输入第"+(i+1)+"本书的价格：");
            double priceIndex=index.nextDouble();

            list.add(i,importBook(nameIndex, isbnIndex,priceIndex));
        }

//        for (int i = 0; i < 3; i++) {
//            list.get(i).print();
//        }

        //输出结果与上面for相等
        for (Book book:list){
            book.print();
        }
    }

    public static Scanner setBook(){
        return new Scanner(System.in);
    }
    public static Book importBook( String name,String isbn,double price){
        Book book=new Book();
        book.setTitle(name);
        book.setIsbn(isbn);
        book.setPrice(price);
        return book;
    }
}
