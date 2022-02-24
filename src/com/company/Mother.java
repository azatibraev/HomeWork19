package com.company;

public class Mother extends Family implements BuildingService, Rental{

    public Mother() {
    }

    public Mother(String name, byte age, boolean solvency) {
        super(name, age, solvency);
    }

    @Override
    public String getName() {
        return "mother";
    }

    @Override
    public void payAUtilities() {
        System.out.println("She can pay because she have work");
    }

    @Override
    public void payARent() {

    }
}