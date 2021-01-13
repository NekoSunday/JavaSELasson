package com.sunday.HomeWorkday11.HomeWork03;

import java.util.ArrayList;
import java.util.Scanner;

public class BuySystem {
    //添加静态数组，防止多个相同对象的创建
    static ArrayList<Goods> list = new ArrayList<Goods>();
//    static ArrayList<Goods> getBuyList = new ArrayList<>();

    public static void main(String[] args) {
        goodsList();
        System.out.println("            欢迎使用超市购物系统           ");
        printSystem();
        selectMenu();
    }

    private static ArrayList<Goods> enterBuyGoods(ArrayList<Goods> list) {
        while (true) {
            String next = enter().next();
            String[] splitIndex = next.split("-");
            char[] chindex = splitIndex[0].toCharArray();
            String id = splitIndex[0];
            findGoods(id);
            char[] ch = list.get(list.size() - 1).getId().toCharArray();
            //判定输入是否为end
            if (!next.startsWith("end")) {
                //判定是否存在"-"，以及判定输入长度是否大于等于5
                if (next.equals("-") || next.length() < 5) {
                    System.out.println("您输入的购买姿势不对，请重新输入(格式为：商品id-购买数量)");
                } else {
                    //判断输入的id是后缀是否比id大，以及判定长度
                    if (ch.length < 3 || ch[ch.length - 1] < chindex[chindex.length - 1]) {
                        System.out.println("您输入的购买姿势不对，请重新输入(格式为：商品id-购买数量)");
//                        System.out.println(Arrays.toString(chindex));
                        //判断输入的id是否存在，数量是否有填上
                    } else if (Integer.parseInt(splitIndex[0]) > Integer.parseInt(list.get(list.size() - 1).getId()) || splitIndex[splitIndex.length - 1] == null) {
                        System.out.println("您输入的购买姿势不对，请重新输入(格式为：商品id-购买数量)");
                    } else {
                        int cutZero=0;
                        check:
                        for (int i = 0; i < splitIndex[1].length(); i++) {
                            //判定输入是否有英文字母
                            char c = splitIndex[1].charAt(i);
                            char[] chars = splitIndex[1].toCharArray();
                            if (c < 48 || c > 57) {
                                System.out.println("您输入的购买姿势不对，请重新输入(格式为：商品id-购买数量)");
                                break check;
                            } else {
                                //去0动作
                                if (!(chars[i] == 48)) {
                                   cutZero=i;
                                   break check;
                                }
                            }
                        }
                        String substring = splitIndex[1].substring(cutZero);
                        Goods goodsIndex = findGoods(splitIndex[0]);
//                                int index = Integer.parseInt(splitIndex[1]);
                        int index = Integer.parseInt(substring);
                        assert goodsIndex != null;
                        goodsIndex.setBuyNum(goodsIndex.getBuyNum() + index);
                    }
                }
            } else {
                System.out.println("购买结束");
                break;
            }
        }
        return list;
    }

    //找需要增加购买数量的对象
    private static Goods findGoods(String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }

    //输出已购买的商品
    private static void showBuyGoods(ArrayList<Goods> list) {
        int count = 0;
        int sumNum = 0;
        double goodsSumPrice = 0;
        System.out.println("名称      单价      数量      金额");
        print();
        for (int i = 0; i < list.size(); i++) {
            Goods index = list.get(i);
            if (index.getBuyNum() != 0) {
                count++;
                sumNum += list.get(i).getBuyNum();
                double sumPrice = list.get(i).getBuyNum() * list.get(i).getSinglePrice();
                goodsSumPrice += sumPrice;
                System.out.println(index.getName() + "  " + index.getSinglePrice() + "        " + index.getBuyNum() + "      " + sumPrice);
            }
        }
        print();
        System.out.println(count + "项商品");
        System.out.println("共计：" + sumNum + "件");
        System.out.println("共：" + goodsSumPrice + "元");
    }

    //初始化Goods
    private static ArrayList<Goods> goodsList() {
        Goods g1 = new Goods("001", "少林核桃", 15.5, "斤");
        Goods g2 = new Goods("002", "尚康饼干", 14.5, "包");
        Goods g3 = new Goods("003", "移动硬盘", 345.0, "个");
        Goods g4 = new Goods("004", "高清无码", 199.0, "G");
        list.add(g1);
        list.add(g2);
        list.add(g3);
        list.add(g4);
        return list;
    }

    //选择菜单
    private static void selectMenu() {
        Scanner sc = new Scanner(System.in);
        int nextInt = sc.nextInt();
        if (nextInt == 1) {
            print();
            printGoods();
            System.out.println("请输入您要购买的商品项：");
            enterBuyGoods(list);
            printSystem();
            selectMenu();
        } else if (nextInt == 2) {
            showBuyGoods(list);
            print();
            printSystem();
            selectMenu();
        } else if (nextInt == 3) {
            System.out.println("感谢您使用超市购物系统，欢迎下次光临，拜拜");
        } else {
            System.out.println("输入有误，请重新输入");
            selectMenu();
        }
    }

    public static void print() {
        System.out.println("-------------------------------------");
    }

    public static void printSystem() {
        System.out.println("请输入你要进行的操作：");
        System.out.println("1：购买商品      2：结算并打印小票      3：退出系统");
    }

    //输出初始化的商品，并打印
    public static void printGoods() {
//        ArrayList<Goods> list = goodsList();
        System.out.println("商品id      名称      单价      计价单位");
        for (int i = 0; i < list.size(); i++) {
            Goods index = list.get(i);
            System.out.println(index.getId() + "      " + index.getName() + "      " + index.getSinglePrice() + "      " + index.getPriceUnit());
//            System.out.println(list.size());
        }
        print();
    }

    //添加匿名对象
    public static Scanner enter() {
        return new Scanner(System.in);
    }
}
