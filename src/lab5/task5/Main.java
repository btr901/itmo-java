package lab5.task5;

public class Main {

    public static void main(String[] args) {
        String inputWord = "инверсия строки тест java";
        String invertedWord = invertWords(inputWord);
        System.out.println(invertedWord);
    }
    public static String invertWords(String input) {
        String[] words = input.split(" ");
        StringBuilder invertedMake = new StringBuilder();
        for (String word : words) {
            String invertedWord = invertWordNew(word);
            invertedMake.append(invertedWord).append(" ");
        }
        return invertedMake.toString().trim();
    }
    private static String invertWordNew(String word) {
        char[] charArray = word.toCharArray();
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);
    }
}