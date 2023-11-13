package ru.itmo.java.basics.lab1.task6;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число b: ");
        int b = scanner.nextInt();
        if (b % 2 == 0) {
            if (b > 100) {
                System.out.println("Выход за пределы диапазона");
            } else {
                System.out.println("Четное");
            }
        } else {
            System.out.println("Нечетное");
        }
    }
}
