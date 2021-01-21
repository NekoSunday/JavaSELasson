package com.sunday.Jsoup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/*
*public boolean add(E e) ： 把给定的对象添加到当前集合中 。
* public void clear() :清空集合中所有的元素。
* public boolean remove(E e) : 把给定的对象在当前集合中删除。
* public boolean contains(E e) : 判断当前集合中是否包含给定的对象。
* public boolean isEmpty() : 判断当前集合是否为空。
* public int size() : 返回集合中元素的个数。
* public Object[] toArray() : 把集合中的元素，存储到数组中。
* */
public class pratice {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("admin1");
        list.add("admin2");
        list.add("admin3");
        list.add("admin4");
        list.add("admin5");

        System.out.println(list);

        list.remove("admin2");
        System.out.println(list);

        boolean checkFalse = list.remove("admin6");
        System.out.println(checkFalse);

        boolean flag = list.contains("admin5");
        System.out.println(flag);

        boolean flag1 = list.isEmpty();
        System.out.println(flag1);

        System.out.println(list.size());

        Object[] objects = list.toArray();
        System.out.println(Arrays.toString(objects));

//        list.clear();
//        System.out.println(list.isEmpty());
        ///迭代器遍历
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.print(s+" ");
        }
        System.out.println();
        //增强for遍历(用于集合or数组)
        for (String s:list){
            System.out.print(s+" ");
        }

    }
}
