package com.sunday.HomeWorkday06;

import java.util.ArrayList;

public class HomeWork07 {
    public static void main(String[] args) {
        ArrayList<Worker> list = new ArrayList<>();
        Worker w1 = new Worker("bz001", "黄渤", 45);
        Worker w2 = new Worker("bz002", "孙红雷", 48);
        Worker w3 = new Worker("bz003", "罗志祥", 35);
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(findMaxAge(list));
        list.get(0).show();

    }

    public static Worker findMaxAge(ArrayList<Worker> workers) {
        Worker maxAgeWorker = new Worker();
        workers.add(0, maxAgeWorker);
        int maxIndex = workers.get(0).getAge();
        for (int i = 0; i < workers.size(); i++) {
            workers.get(i).show();
            if (workers.get(i).getAge() > maxIndex) {
                maxIndex = workers.get(i).getAge();
                maxAgeWorker.setAge(maxIndex);
                maxAgeWorker.setId(workers.get(i).getId());
                maxAgeWorker.setName(workers.get(i).getName());
            }

        }
        return maxAgeWorker;
    }
}
