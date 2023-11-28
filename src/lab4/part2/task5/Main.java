package lab4.part2.task5;

public class Main {

    public static void main(String[] args) {
        int[] array = randomArr(4);
        System.out.println("исходный:");
        printArr(array);
        mergeArr(array, 0, array.length - 1);
        System.out.println("\nотсортированный:");
        printArr(array);
    }
    private static void mergeArr(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeArr(array, left, middle);
            mergeArr(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }
    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
    private static int[] randomArr(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
    private static void printArr(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
