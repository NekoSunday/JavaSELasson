package com.sunday.demo01;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWorkday04 {
    public static void main(String[] args) {
//        printEven();

//        int a=getSum(100);
//        System.out.println(a);

//        int length=20,width=8;
//        int zc = getPerimeter(length, width);
//        System.out.println(zc);
//        int area=getArea(length,width);
//        System.out.println(area);

//        char aChar = getChar(50);
//        System.out.println(aChar);

//        showColor("red");

//        printX(10);

//        int a=round(10.1);
//        System.out.println(10.1+"->"+a);

//        printNinexNine();

//        DoubleArr();

//        int[] arr={1,8,10,12,18,28,12};
//        printBall(arr);

//        int[] arr={95, 92, 75, 56, 98, 71, 80, 58, 91, 91};
//        int count=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>getAvg(arr)){
//                count++;
//            }
//        }
//        System.out.println(count);

//        arrTest01();
//        arrTest02();
//        Mark();
//        markSum();
        DDZ1();
    }

    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int getPerimeter(int length, int width) {
        int girth = (length + width) * 2;
        return girth;
    }

    public static int getArea(int length, int width) {
        int square = length * width;
        return square;
    }

    public static char getChar(int num) {
        char ch = (char) num;
        if (num >= 65 && num <= 90) {
            return ch;
        } else if (num >= 97 && num <= 122) {
            return ch;
        } else if (num >= 48 && num <= 57) {
            return ch;
        } else {
            return ' ';
        }
    }

    public static void showColor(String str) {
        switch (str) {
            case "red":
                System.out.println(str + "是红色！");
                break;
            case "blue":
                System.out.println(str + "是蓝色！");
                break;
            case "green":
                System.out.println(str + "是绿色！");
                break;
            default:
                System.out.println("颜色未知");
        }
    }

    public static void printX(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i) {
                    System.out.print("O");
                } else if ((i + j) == n + 1) {
                    System.out.print("O");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static int round(double n) {
        int temp;
        temp = (int) (n + 0.5);
        return temp;
    }

    public static double hsd(double ssd) {
        double hsd = ssd * (9.0 / 5) + 32;
        return hsd;
    }

    public static double ssd(double hsd) {
        double ssd = (hsd - 32) / (9.0 / 5);
        return ssd;
    }

    public static void printNinexNine() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i >= j) {
                    System.out.print(j + "*" + i + "=" + (i * j) + "    ");
                }
            }
            System.out.println();
        }
    }

    public static void getArrMin() {
        int[] arr = {12, 33, 25, 6, 16};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void printArr() {
        int[] arr = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void DoubleArr() {
        int[] sums = {5, 10, 15};
        int[] newArr = new int[sums.length];
        System.out.println();
        for (int i = 0; i < sums.length; i++) {
            System.out.print(sums[i] + " ");
        }
        for (int i = 0; i < sums.length; i++) {
            newArr[i] = sums[i] * 2;
            System.out.print(newArr[i] + " ");

        }
    }

    public static void printBall(int[] arr) {
        System.out.println("您的双色球号码为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static void arrTest01() {
        int[] arr = {1, 2, 3, 4, 3, 2, 1};
        boolean flag = true;
        boolean[] newArr = new boolean[arr.length / 2];
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {
                newArr[i] = true;
            } else {
                newArr[i] = false;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == false) {
                flag = false;
                break;
            }
        }
        System.out.print("] 是否对称：" + flag);
    }


    public static void arrTest02() {
        String[] arr1 = {"1", "2", "3", "4", "3", "2", "1"};
        String[] arr2 = {"1", "2", "3", "4", "3", "2", "1"};
        boolean flag = true;
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]);
            } else {
                System.out.print(arr1[i] + ",");
            }
        }
        System.out.println("]");
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.print(arr2[i]);
            } else {
                System.out.print(arr2[i] + ",");
            }
        }
        System.out.println("]");
        int length = 0;
        if (arr1.length == arr2.length) {
            length = arr1.length;
        } else {
            System.out.println("不一致");
            ;
        }
        boolean[] newArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            if (arr1[i].equals(arr2[i])) {
                newArr[i] = true;
            } else {
                newArr[i] = false;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] == false) {
                flag = false;
                break;
            }
        }
        System.out.println("是否一致:" + flag);
    }

    public static void Mark() {
        String[] answer = {"A", "D", "B", "C", "D"};
        String[] xiaoMing = {"D", "C", "B", "A", "D"};
        String[] xiaoHong = {"A", "D", "B", "C", "D"};
        String[] xiaoHuang = {"A", "D", "B", "C", "A"};
        String[] xiaoQiang = {"A", "B", "C", "D", "D"};
        int XMnum = 0, XHonum = 0, XHunum = 0, XQnum = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i].equals(xiaoMing[i])) {
                XMnum += 2;
            }
            if (answer[i].equals(xiaoHong[i])) {
                XHonum += 2;
            }
            if (answer[i].equals(xiaoHuang[i])) {
                XHunum += 2;
            }
            if (answer[i].equals(xiaoQiang[i])) {
                XQnum += 2;
            }
        }
        System.out.println(XMnum + " " + XHonum + " " + XHunum + " " + XQnum);
    }

    public static void DDZ() {
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♦", "♣", "♥", "♠"};
        ArrayList<String> card = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                card.add(color[j] + num[i]);
            }
        }

        card.add("joker");
        card.add("JOKER");

        Collections.shuffle(card);
        System.out.println("这副牌洗完牌之后：" + card);
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> lastCard = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            if (i < 51) {
                if (i % 3 == 1) {
                    player1.add(card.get(i));
                } else if (i % 3 == 2) {
                    player2.add(card.get(i));
                } else if (i % 3 == 0) {
                    player3.add(card.get(i));
                }
            } else {
                lastCard.add(card.get(i));
            }
        }
        System.out.println("玩家1手牌为：" + player1);
        System.out.println("玩家2手牌为：" + player2);
        System.out.println("玩家3手牌为：" + player3);
        System.out.println("底牌为：" + lastCard);
    }

    public static void markSum() {
        int[] arr = {99, 100, 98, 97, 96};
        int sum = 0;
        int avg = 0;
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }

    public static void DDZ1() {
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] cards = new String[num.length * color.length + 2];
//        String[] newCards = new String[cards.length];
        int[] randomTrue = new int[cards.length];
        int count = 0;
        cards[count] = "joker";
        cards[count + 1] = "JOKER";
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < color.length; j++) {
                cards[count + 2] = color[j] + num[i];
                System.out.print(cards[count] + " ");
                count++;
            }
        }
        System.out.println();
        int length = cards.length;
        for (int i = 0; i < cards.length; i++) {
            int cardsRandom = (int) Math.floor((Math.random() * (length - 1)));
            String temp = cards[i];
            cards[i] = cards[cardsRandom];
            cards[cardsRandom] = temp;
        }
        for (int i = 0; i < length; i++) {
            System.out.print(cards[i]+" ");
        }
    }
}

