package com.sunday.tcpPratice;

 public class student extends base {
//     private String name;
//     private int age;

     static {
         System.out.println("子类启动");
     }

     public student(String name, int age) {
         super(name, age);
     }

//     @Override
//     public String getName() {
//         return name;
//     }
//
//     @Override
//     public void setName(String name) {
//         this.name = name;
//     }
//
//     @Override
//     public int getAge() {
//         return age;
//     }
//
//     @Override
//     public void setAge(int age) {
//         this.age = age;
//     }
//
//    public student(String name, int age) {
//        super(name, age);
//    }

     @Override
     public void test() {
         System.out.println(super.getName());
         System.out.println(this.getAge());
         System.out.println("测试1");
     }

     public void eat(){
         super.sleep();
         System.out.println("子类吃饭");
     }
 }
