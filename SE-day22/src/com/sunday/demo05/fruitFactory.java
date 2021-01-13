package com.sunday.demo05;

public class fruitFactory extends createFactory{
    @Override
    public <T extends Fruit> T createHuman(Class<T> fruit) {
        try {
            Fruit f = fruit.newInstance();
            return (T)f;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public <T extends Fruit> T createHuman(String className) {
        try {
            Class<?> aClass = Class.forName(className);
            Object obj = aClass.newInstance();
            return (T) obj;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
