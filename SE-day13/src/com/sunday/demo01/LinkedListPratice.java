package com.sunday.demo01;

import java.util.LinkedList;

public class LinkedListPratice {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("a");
        System.out.println(list);
        test02(list);
    }

    private static void test02(LinkedList<String> list) {
        //添加最后一个元素
        list.addLast("u");
        //获取最后的元素
        System.out.println(list.getLast());
        System.out.println(list);
        //删除最后一个元素
        list.removeLast();
        System.out.println(list);
        //判断是否空
        System.out.println(list.isEmpty());
        //链表选择？
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        //链表删除指定的第一个元素
        list.removeFirstOccurrence("c");
        System.out.println(list);
        //删除链表中从后数指定的第一个元素
        list.removeLastOccurrence("a");
        System.out.println(list);
        //移出首尾元素
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        System.out.println(list);
    }

    private static void test01(LinkedList<String> list) {
        //添加首位元素
        list.addFirst("p");
        System.out.println(list);
        //获取首位元素
        System.out.println(list.getFirst());
        //删除首位元素
        list.removeFirst();
        System.out.println(list);
        //链表第一个元素弹出(不再存在链表中)
        list.pop();
        System.out.println(list);
        //加入一个元素到链表首位
        list.push("o");
        System.out.println(list);

    }
}
