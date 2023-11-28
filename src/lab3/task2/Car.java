package ru.itmo.java.basics.lab3.task2;

public class Car {
    private String color;
    private String name;
    private double weight;
    //цвет названия и вес
    public Car(String color, String name, double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
    //цвет и вес
    public Car(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }
    //цвет
    public Car(String color) {
        this.color = color;
    }
    //пусто
    public Car() {
    }
    public void display() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(weight);
    }
    public static void main(String[] args) {
        Car car1 = new Car("blue", "subaru", 3000);
        Car car2 = new Car("black", 5000);
        car1.display();
        car2.display();
    }
}
