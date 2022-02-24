package com.company;

public class Daughter extends Family implements BuildingService, Rental {

    public Daughter() {
    }

    public Daughter(String name, byte age, boolean solvency) {
        super(name, age, solvency);
    }

    @Override
    public void payAUtilities() {
        System.out.println("She can't pay, because she is a schoolgirl");
    }

    @Override
    public void payARent() {

    }
}