package com.sunday.HomeWorkday14.HomeWork2.GQ2.HomeWork01;

public class Son extends Father {
    public Son() {
    }
//正确重写e
//    @Override
//    public void eat() throws FrontToothPainExcption,BigToothPainException {
//        super.eat();
//    }

    //正确重写 c
//    @Override
//    public void eat() throws ToothPainException {
//        throw new ToothPainException("牙疼!!");
//    }

//正确重写 d
//    @Override
//    public void eat() throws ToothPainException {
//        throw new BigToothPainException("牙疼！");
//    }

//正确重写 d
//    @Override
//    public void eat() throws ToothPainException {
//        throw new FrontToothPainExcption("牙疼！");
//    }

    //错误重写 b
//    @Override
//    public void eat() throws ToothPainException {
//        throw new PainExecption("痛！")
//    }

//错误重写 a
//    @Override
//    public void eat() throws ToothPainException {
//        throw new TonguePainException("舌头疼");
//    }

//错误重写 f
//    @Override
//    public void drink() throws ToothPainException{
//        super.drink();
//    }

    //重写g

    @Override
    public void drink() {
        try {
            throw new TonguePainException("喝了100度的水");
        } catch (TonguePainException e) {
            e.printStackTrace();
        }
    }
}
