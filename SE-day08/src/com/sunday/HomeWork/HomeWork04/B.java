package com.sunday.HomeWork.HomeWork04;

public abstract class B extends A{
    private int numb=20;

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public abstract void showB();

    @Override
    public void showA() {

    }
}
