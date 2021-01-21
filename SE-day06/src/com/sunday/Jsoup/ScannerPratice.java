package com.sunday.Jsoup;

import java.util.Scanner;

public class ScannerPratice {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        int i = scan.nextInt();
//        System.out.println(i);
//
//        String next = scan.next();
//        System.out.println(next);
//
//        String line = scan.nextLine();
//        System.out.println(line);

//        System.out.println(new Scanner(System.in).nextLine());

//        printScanner(new Scanner(System.in));

        Scanner sc=getScanner();
        String str=sc.nextLine();
        System.out.println(str);
    }

    public static Scanner getScanner(){
        return new Scanner(System.in);
    }

    public static void printScanner(Scanner sc){
        System.out.println(sc.nextLine());
    }
}
