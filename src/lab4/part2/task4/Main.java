package lab4.part2.task4;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};
        int first = unique(array);
        System.out.println("Первое уникальное число: " + first);
    }
    private static int unique(int[] array) {
        int[] free = new int[1000];
        for (int num : array) {
            free[num]++;
        }
        for (int num : array) {
            if (free[num] == 1) {
                return num;
            }
        }
        return -1;
    }
}
