package com.sunday.demo06;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//规定注解范围
@Target({ElementType.METHOD,ElementType.PARAMETER,ElementType.TYPE})
//生命周期改变
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
     String value();
     double price() default 100;
     String[] authors();
}
