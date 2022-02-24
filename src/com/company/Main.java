package com.company;

public class Main {

    public static void main(String[] args) {


        Father father = new Father("Robert", (byte) 35, true);
        Mother mother = new Mother("Emma", (byte) 30, true);
        Son son = new Son("Brady", (byte) 15, false);
        Daughter daughter = new Daughter("Sandy", (byte) 8, false);


        Family[] members = {father,mother, son, daughter};
        for (Family member : members) {
            System.out.println(member.toString());
        }

        System.out.println("*********************");


        Apartment apartment = new Apartment("New York city",new BuildingService[]
                {father, mother, son, daughter});
        System.out.println(apartment);
        int count = 0;
        for (int i = 0; i < 4; i++) {
            count++;
        }

        System.out.println("Amount members: " + count);
        apartment.payAUtilities();

        System.out.println("*********************");


        GuestHouse guestHouse = new GuestHouse("Chicago",new Rental[]
                {father, mother, son});
        System.out.println(guestHouse);
        int count1 = 0;
        for (int i = 0; i < 3; i++) {
            count1++;
        }

        System.out.println("Amount members: " + count1);
        guestHouse.payARent();

        System.out.println("********************");


        Hostel hostel = new Hostel("Illinois", new Rental[]
                {father, mother});

        System.out.println(hostel);
        int count2 = 0;
        for (int i = 0; i < 2; i++) {
            count2++;
        }

        System.out.println("Amount members: " + count2);
        hostel.payARent();
    }
}