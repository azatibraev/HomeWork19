package com.company;

public class Son extends Family implements BuildingService, Rental {

    public Son() {
    }

    public Son(String name, byte age, boolean solvency) {
        super(name, age, solvency);
    }

    @Override
    public void payAUtilities() {
        System.out.println("He can't pay because he is a schoolgirl");
    }

    @Override
    public void payARent() {

    }
}