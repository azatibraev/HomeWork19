package com.company;

import java.util.Arrays;

public abstract class Family implements BuildingService, Rental {

    private String name;
    private byte age;
    private boolean solvency;

    public Family() {
    }

    public Family(String name, byte age, boolean solvency) {
        this.name = name;
        this.age = age;
        this.solvency = solvency;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean isSolvency() {
        return solvency;
    }

    public void setSolvency(boolean solvency) {
        this.solvency = solvency;
    }


    @Override
    public String toString() {
        return "Family's members: " + name + '\n' +
                "age: " + age + '\n' +
                "solvency: " + solvency + '\n';
    }
}
