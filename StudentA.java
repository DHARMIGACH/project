package com.xworkz.datatypes.things;

public class StudentA {

    public void useLaptop() {
        Laptop laptop = new Laptop();
        laptop.start();
        laptop.shutdown();
        System.out.println("Brand: " + laptop.brand);
        System.out.println("Price: " + laptop.price);
    }
}
