package com.sunday.demo04;

public class FruitFactory {
    public fruit createFruit(String Type){
        if (Type.equals("Apple")){
            return new Apple();
        }else if (Type.equals("Pear")){
            return new Pear();
        }
        return null;
    }
}
