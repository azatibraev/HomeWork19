package com.company;

import java.util.Arrays;

public class Hostel implements Rental {

    private String address;
    private Rental[] members;

    public Hostel() {
    }

    public Hostel(String address) {
        this.address = address;
    }

    public Hostel(String address, Rental[] members) {
        this.address = address;
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Rental[] getMembers() {
        return members;
    }

    public void setMembers(Rental[] members) {
        this.members = members;
    }

    @Override
    public void payARent() {
        System.out.println("Rental is $250 per month");
    }

    @Override
    public String toString() {
        return "Hostel address: " + address + '\n' +
                 Arrays.toString(members);
    }
}
