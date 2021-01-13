package com.sunday.tcpPratice;

import java.io.File;
import java.io.IOException;

public class pratice {
    public static void main(String[] args) throws IOException {

        test08();
    }

    private static void test08() {
        File f1 = new File("D:\\JavaSE\\SE-day17\\src\\com\\sunday\\demo\\newDir1");
        File f2 = new File("D:\\JavaSE\\SE-day17\\src\\com\\sunday\\demo\\newDir2");
        File f3 = new File("D:\\JavaSE\\SE-day17\\src\\com\\sunday\\demo\\newDir3");
        File f4 = new File("D:\\JavaSE\\SE-day17\\src\\com\\sunday\\demo\\newDir4");
        File f5 = new File("D:\\JavaSE");
        //获取当前目录下的文件以及文件夹的名称
        String[] name=f5.list();
        for (String s : name) {
            System.out.println(s);
        }
        //获取当前目录下的文件以及文件夹的对象，获取更多的信息
        File[] names=f5.listFiles();
        for (File s : names) {
            System.out.println(s);
        }
    }

    private static void test07() {
        File file = new File("D:\\JavaSE\\SE-day17\\src\\com\\sunday\\demo\\newDir");
        System.out.println(file.mkdir());
        System.out.println(file.exists());
        File file1 = new File("D:\\JavaSE\\SE-day17\\src\\com\\sunday\\demo\\newDir\\newDir1");
        System.out.println(file1.mkdirs());
        System.out.println(file1.exists());

        System.out.println(file1.delete());
        System.out.println(file.delete());
    }

    private static void test06() throws IOException {
        File file = new File("d:\\a.txt");
        System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }

    private static void test05() {

        //获取文件路径、长度、名字
        File file = new File("bbb.java");
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file.length());

        //获取目录路径、长度、名字
        File file1 = new File("d:/aaa");
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getName());
        System.out.println(file1.length());

    }

    private static void test04() {
        //创建父路径，再用父对象+子路径，创建文件
        File parentDir=new File("D:\\aaa");
        File file = new File(parentDir, "aaa.txt");
    }

    private static void test03() {
        //父路径+子路径创建file
        File file = new File("D:\\JavaSE\\SE-day17\\src\\com\\sunday\\demo", "a.txt");
        System.out.println(file.getPath());
    }

    private static void test02() {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
    }

    private static void test01() {
        //创建file
        String name="D:\\JavaSE\\SE-day17\\src\\com\\sunday\\demo\\a.txt";
        File file = new File(name);
        System.out.println(file.getPath());
    }
}
