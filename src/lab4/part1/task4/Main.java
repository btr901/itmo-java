package lab4.part1.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int third = scanner.nextInt();
        boolean result = (second > first) && (third > second);
        System.out.println("Результат: " + result);
    }
}
