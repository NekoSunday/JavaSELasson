package com.sunday.HomeWorkday12.MyList;

import java.util.Arrays;

public class MyList<E> {
    private int DEFAULT_WDITH = 10;
    private Object[] ELE_EMPTY_DATA = {};
    private Object[] ELE_DATA;
    private int size;

    public MyList() {
        ELE_DATA = ELE_EMPTY_DATA;
    }

    public boolean add(E e) {
        checkMinSize(size + 1);
        ELE_DATA[size++] = e;
        return true;
    }

    public void checkMinSize(int minSize) {
        changeSize(getMinSize(ELE_DATA, minSize));
    }

    public int getMinSize(Object[] ELEDATA, int minSize) {
        if (ELEDATA == ELE_EMPTY_DATA) {
            return Math.max(DEFAULT_WDITH, minSize);
        }
        return minSize;
    }

    public void changeSize(int minSize) {
        if (minSize - ELE_DATA.length > 0) {
            plusWidth(minSize);
        }
    }

    private void plusWidth(int minSize) {
        int oldSize = ELE_DATA.length;
        int newSize = oldSize + (oldSize / 2);
        if (newSize - minSize < 0) {
            newSize = minSize;
        }
        ELE_DATA = Arrays.copyOf(ELE_DATA, newSize);
    }

    public int size() {
        return size;
    }

    public E remove(int index) {
        checkMaxSize(index);

        E oldValue = (E) ELE_DATA[index];
        int moveNum = size - index - 1;
        if (moveNum > 0) {
            System.arraycopy(ELE_DATA, index + 1, ELE_DATA, index, moveNum);
        }
        ELE_DATA[--size] = null;
        return oldValue;
    }

    private void checkMaxSize(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("超出长度！");
        }
    }

    public E get(int index) {
        checkMinSize(index);
        return (E) ELE_DATA[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            ELE_DATA[i] = null;
        }
        size = 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            if (i < size - 1) {
                stringBuilder.append(ELE_DATA[i]).append(",");
            }else{
                stringBuilder.append(ELE_DATA[i]);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public E set(int index,E e){
        checkMaxSize(index);
        E oldValue =(E)ELE_DATA[index];
        ELE_DATA[index]=e;
        return oldValue;
    }
}
