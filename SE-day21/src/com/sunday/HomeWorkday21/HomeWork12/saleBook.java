package com.sunday.HomeWorkday21.HomeWork12;

import java.lang.reflect.Method;
import java.util.Arrays;

public class saleBook {

    @Book(value = "三国演义",price = 125.55,authors = {"you","me"})
    public void show() throws Exception {
        Class<saleBook> sbc = saleBook.class;
        Method show = sbc.getMethod("show");
        if (show.isAnnotationPresent(Book.class)) {
            Book book=show.getAnnotation(Book.class);

            String val=book.value();
            double price=book.price();
            String[] authors=book.authors();
            System.out.println(val);
            System.out.println(price);
            System.out.println(Arrays.toString(authors));
        }
    }
}
