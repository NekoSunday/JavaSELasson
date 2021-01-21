package com.sunday.Jsoup;

public final class Teacher extends Person{
    public Teacher(String name, String id) {
        super(name, id);
    }

    public Teacher() {
    }

    public void teach(){
        System.out.println("教学ing");
    }
}
