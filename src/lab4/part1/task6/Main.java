package lab4.part1.task6;

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 1, 6, 8, 5};
        if (yesNo(array)) {
            System.out.println("Есть число 1 или 3.");
        } else {
            System.out.println("Нет числа 1 или 3.");
        }
    }
    public static boolean yesNo(int[] array) {
        for (int number : array) {
            if (number == 1 || number == 3) {
                return true;
            }
        }
        return false;
    }
}
