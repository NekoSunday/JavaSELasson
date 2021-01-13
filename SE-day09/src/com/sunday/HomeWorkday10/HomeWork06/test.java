package com.sunday.HomeWorkday10.HomeWork06;

public class test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("马云",45);
        SportTeacher t2=new SportTeacher("大姚",35);
        Student s1 = new Student("小王", 20);
        SportStudent s2 = new SportStudent("王中王", 21);

        System.out.print(t2.getAge()+" "+t2.getName());
        goToSport(t2);
        System.out.print(s2.getAge()+" "+s2.getName());
        goToSport(s2);
    }

    public static void goToSport(Sport person){
        person.playBasketball();
    }
}
