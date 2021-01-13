package com.sunday.HomeWorkday05Extra;

public class Vehicle {
    private double speed;
    private String type;

    public Vehicle(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }

    public double speedUp(double speed) {
        double up = speed * 2.5;
        setSpeed(up);
        return up;
    }

    public double speedDown(double speed) {
        double down = speed / 3;
        setSpeed(down);
        return down;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public String getType() {
        return type;
    }

    public void print() {
        System.out.println(getType() + " " + getSpeed() + " " +speedDown(getSpeed())+ " "+speedUp(getSpeed()));
    }
}
