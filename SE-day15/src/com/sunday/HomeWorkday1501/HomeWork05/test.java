package com.sunday.HomeWorkday1501.HomeWork05;

public class test {

    private static final Object obj=new Object();
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            Random rd = new Random();
//            int people = rd.nextInt(100) + 1;
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    System.out.println("第"+people+"号人通过山洞");
//                }
//            }).start();
//        }

        for (int i = 1; i <= 10; i++) {
            new Thread(() -> {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + "通过山洞");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"admin"+i).start();
        }
    }
}
