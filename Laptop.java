package com.xworkz.datatypes.things;

public class Laptop {
    
    public String brand = "Dell";
    public double price = 75000;

    public Laptop() {
        System.out.println("Created a Laptop with no arguments...");
    }
    
    public void start() {
        System.out.println("Laptop is starting...");
    }
    
    public void shutdown() {
        System.out.println("Laptop is shutting down...");
    }
}
