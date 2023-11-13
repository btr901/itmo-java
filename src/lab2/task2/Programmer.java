package ru.itmo.java.basics.lab2.task2;

public class Programmer {
    private String name;
    private int age;
    private String Language;
    //без параметров
    public Programmer() {
        this.name = "Undefined";
        this.age = 0;
        this.Language = "Undefined";
    }
    //со всеми параметрами
    public Programmer(String name, int age, String Language) {
        this.name = name;
        this.age = age;
        this.Language = Language;
    }
    //геттеры и сеттеры
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getLanguage() {
        return Language;
    }
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    //toString() вывода информации о программисте
    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Language='" + Language + '\'' +
                '}';
    }
}
