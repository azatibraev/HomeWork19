package com.company;

import java.util.Arrays;

public class GuestHouse  implements Rental{

    private String address;
    private Rental[] members;

    public GuestHouse() {
    }

    public GuestHouse(String address) {
        this.address = address;
    }

    public GuestHouse(String address, Rental[] members) {
        this.address = address;
        this.members = members;
    }

    @Override
    public void payARent() {
        System.out.println("Rental is $350 per month");
    }

    @Override
    public String toString() {
        return "GuestHouse address: " + address + '\n' + Arrays.toString(members);
    }
}
