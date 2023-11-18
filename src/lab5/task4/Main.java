package lab5.task4;

public class Main {
    public static void main(String[] args) {
        String str1 = "Найти количество вхождений одной подстроку";
        String str2 = "подстрока";
        int count = searchP(str1, str2);
        System.out.println("Вхождения: " + count);
    }
    public static int searchP(String str, String substr) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += substr.length();
        }
        return count;
    }
}
