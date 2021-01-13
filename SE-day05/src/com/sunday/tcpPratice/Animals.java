package com.sunday.tcpPratice;

//public class Animals {
//    String name;
//    double age;
//    String type;
//
//    public void Eat(){
//        System.out.println("进食");
//    }
//    public void Sleep(){
//        System.out.println("睡觉");
//    }
//
//    public void out(){
//        System.out.println();
//    }
//
//}

public class Animals {
    private String name;
    private double age;
    private String type;

//    public Animals(){
//
//    }
    public Animals(String name,double age,String type){
        this.name=name;
        this.age=age;
        this.type=type;
    }


    public void Eat(){
        System.out.println("进食");
    }
//    private void Sleep(){
//        System.out.println("睡觉");
//    }
    public void Sleep(){
        System.out.println("睡觉");
    }


    public void setName(String name){
        this.name= name;
    }
    public void setType(String type){
        this.type= type;
    }
    public void setAge(double age){
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public double getAge(){
        return age;
    }

}
