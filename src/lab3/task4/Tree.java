package ru.itmo.java.basics.lab3.task4;

public class Tree {
    private int age;
    private boolean alive;
    private String name;
    //возраст и название
    public Tree(int age, String name) {
        this.age = age;
        this.name = name;
    }
    //все переменные в классе
    public Tree(int age, boolean alive, String name) {
        this.age = age;
        this.alive = alive;
        this.name = name;
    }
    //конструктор без параметров
    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}