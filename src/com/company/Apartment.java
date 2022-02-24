package com.company;

import java.util.Arrays;

public class Apartment implements BuildingService {

    private String address;
    private BuildingService[] members;

    public Apartment() {
    }

    public Apartment(String address) {
        this.address = address;
    }

    public Apartment(String address, BuildingService[] members) {
        this.address = address;
        this.members = members;
    }

    @Override
    public void payAUtilities() {
        System.out.println("Utilities is $ 150 per month");
    }

    @Override
    public String toString() {
        return "Apartment address: " + address + '\n' +
                Arrays.toString(members);
    }
}