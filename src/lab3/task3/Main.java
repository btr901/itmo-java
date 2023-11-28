package ru.itmo.java.basics.lab3.task3;

public class Main {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setValues(1, 2003, "bungalo");

        House house2 = new House();
        house2.setValues(2, 2004, "villa");

        System.out.println("House 1:");
        house1.displayValues();
        System.out.println("Years since built: " + house1.yearsSinceBuilt());

        System.out.println("\nHouse 2:");
        house2.displayValues();
        System.out.println("Years since built: " + house2.yearsSinceBuilt());
    }
}
