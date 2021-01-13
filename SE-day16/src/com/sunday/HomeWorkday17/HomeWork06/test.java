package com.sunday.HomeWorkday17.HomeWork06;

public class test {
    public static void main(String[] args) {
        invokeDirect(new Director() {
            @Override
            public void makeMovie() {
                System.out.println("电影在做了在做了，别催了");
            }
        });

        invokeDirect(() -> System.out.println("电影在做了在做了，别催了"));
    }
    private static void invokeDirect(Director director)
    {
        director.makeMovie();
    }
}
