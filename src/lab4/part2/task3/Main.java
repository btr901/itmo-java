package lab4.part2.task3;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 2};
        System.out.print("Array 1: ");
        aRray(array);
        swapM(array);
        System.out.print("Array 2: ");
        aRray(array);
    }
    private static void swapM(int[] array) {
        if (array != null && array.length >= 2) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        }
    }
    private static void aRray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
