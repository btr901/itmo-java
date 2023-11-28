package lab5.task3;

public class Main {





    public static void main(String[] args) {
        String txt = "текст бяка кака.";
        String txtR = repLa(txt);
        System.out.println(txtR);
    }
    private static String repLa(String input) {
        return input.replaceAll("\\bбяка\\b", "«[вырезано цензурой]»");
    }
}