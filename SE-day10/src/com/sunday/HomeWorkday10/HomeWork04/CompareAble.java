package com.sunday.HomeWorkday10.HomeWork04;

public interface CompareAble {
    default Apple compare(Apple a1,Apple a2){
        if (a1.getSize()<a2.getSize()){
            return a2;
        }else{
            return a1;
        }
    }
}
