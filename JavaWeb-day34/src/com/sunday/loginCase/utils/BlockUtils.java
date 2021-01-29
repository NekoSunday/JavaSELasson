package com.sunday.loginCase.utils;

public class BlockUtils {

    public static String wordBlock(String word){
        StringBuilder index=new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            index.append("*");
        }
        return index.toString();
    }
}
