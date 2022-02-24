package com.company;

public class Father extends Family implements BuildingService, Rental {

    public Father() {
    }

    public Father(String name, byte age, boolean solvency) {
        super(name, age, solvency);
    }

    @Override
    public void payAUtilities() {
        System.out.println("He should pay because he is a man");
    }

    @Override
    public void payARent() {

    }
}