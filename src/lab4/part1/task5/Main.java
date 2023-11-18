package lab4.part1.task5;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, -3, 7, 4, 5, 4, 5};
        boolean result = checker(array);
        System.out.println(result);
    }
    private static boolean checker(int[] arr) {
        if (arr.length >= 2) {
            return arr[0] == 3 || arr[arr.length - 1] == 3;
        } else {
            System.out.println("Длина массива должна быть больше или равна двум.");
            return false;
        }
    }
}
