package com.sunday.demo05;

public abstract class createFactory {
    public abstract <T extends Fruit> T createHuman(Class<T> fruit);
    public abstract <T extends Fruit> T createHuman(String className);
}
