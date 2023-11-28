package lab5.task2;

public class Palindrom {

    public static boolean palindromeYes(String word) {
        String cleaner = word.replaceAll("\\s", "").toLowerCase();
        int left = 0;
        int right = cleaner.length() - 1;
        while (left < right) {
            if (cleaner.charAt(left) != cleaner.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "java";
        if (palindromeYes(word)) {
            System.out.println(word + " является палиндромом.");
        } else {
            System.out.println(word + " не является палиндромом.");
        }
    }
}