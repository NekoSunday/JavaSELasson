package com.sunday.anli;

import java.util.Scanner;

public class Laptop extends Brand{

    public Laptop(String brand, double price) {
        super(brand, price);
    }

    public void run() {
        System.out.println("价格为"+super.getPrice()+"的"+this.getBrand()+"电脑运行中……");
    }

    public void shutDown() {
        System.out.println("电脑关机了……");
    }

    //加入参数为接口创建的对象
    public void useUsbDevice(USB usb) {
        usb.open();
        System.out.println("Usb设备正在加载……");
        if (usb instanceof Mouse) {
            //向下转型
            Mouse m = (Mouse) usb;
            //转型后调用Click()方法
            m.Click();
        } else if (usb instanceof Keyboard) {
            System.out.println("输入：");
            //字符串转成char类型的数组
            char[] chars = scanner().nextLine().toCharArray();
            //向下转型
            Keyboard k = (Keyboard) usb;
            //转型后调用enter()方法
            k.enter();
            System.out.println(chars);
        }
//        System.out.println("Usb设备没有加载……");
        usb.close();
    }

    public Scanner scanner(){
        return new Scanner(System.in);
    }
}
