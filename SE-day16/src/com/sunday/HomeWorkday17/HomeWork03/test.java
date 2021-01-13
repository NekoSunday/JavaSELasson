package com.sunday.HomeWorkday17.HomeWork03;

import java.util.Random;
import java.util.concurrent.*;

public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Integer allSum = 0;
        /*for (int i = 0; i < 3; i++) {
            Future<Integer> s = service.submit(() -> {
                Integer sum = 0;
                for (int j = 0; j < 10; j++) {
                    sum += (new Random().nextInt(100) + 1);
                }
                return sum / 10;
            });
            allSum += s.get();
        }*/
        for (int i = 0; i < 3; i++) {
            Future<Integer> f = service.submit(test::getSum);
            allSum += f.get();
        }

        System.out.println(allSum);
        System.out.println(allSum / 3);

    }

    public static Integer getSum(){
        Integer sum = 0;
        for (int j = 0; j < 10; j++) {
            sum += (new Random().nextInt(100) + 1);
        }
        return sum / 10;
    }
}
