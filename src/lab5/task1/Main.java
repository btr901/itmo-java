package lab5.task1;

public class Main {

    public static String longWord(String txt) {
        if (txt == null || txt.isEmpty()) {
            return null;
        }
        String[] words = txt.split("\\s+");
        String wordLong = "";
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Zа-яА-Я]", "");
            if (word.length() > wordLong.length()) {
                wordLong = word;
            }
        }
        return wordLong;
    }
    public static void main(String[] args) {
        String txt = "Соображения высшего порядка, а также выбранный нами инновационный путь требует от нас анализа системы обучения кадров, соответствующей насущным потребностям! Значимость этих проблем настолько очевидна, что новая модель организационной деятельности позволяет оценить значение всесторонне сбалансированных нововведений? Повседневная практика показывает, что курс на социально-ориентированный национальный проект обеспечивает актуальность системы обучения кадров, соответствующей насущным потребностям?";
        String wordLong = longWord(txt);
        System.out.println("слово: " + wordLong);
    }
}