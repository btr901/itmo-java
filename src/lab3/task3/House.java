package ru.itmo.java.basics.lab3.task3;

class House {
    private int floors;
    private int yearBuilt;
    private String name;
    public void setValues(int floors, int yearBuilt, String name) {
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.name = name;
    }
    public void displayValues() {
        System.out.println("House Name: " + name);
        System.out.println("Number of floors: " + floors);
        System.out.println("Year Built: " + yearBuilt);
    }
    public int yearsSinceBuilt() {
        return 2023 - yearBuilt;
    }
}
