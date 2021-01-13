package com.sunday.HomeWorkday12.MyList;

public class test {
    public static void main(String[] args) {
        MyList<String> list=new MyList<>();
        list.add("123");
        list.add("456");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);

    }
}
