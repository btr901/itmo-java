package lab6.task4;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Значение: ");
        int truckNumber = scanner.nextInt();
        Airplane airplane = new Airplane(truckNumber);
        airplane.showMyNumber();
    }
}
