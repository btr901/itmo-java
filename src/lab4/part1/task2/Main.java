package lab4.part1.task2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Делится на 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nДелится на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nДелится на 3 и на 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
