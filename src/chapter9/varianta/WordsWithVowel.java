package chapter9.varianta;

import helper.InputOutputHelper;

import java.util.StringTokenizer;

public class WordsWithVowel {

    private static final String DELIMITER = " ,.!;:?";
    private static final String WORD_BEGINS_VOWEL_LETTER = "^[aieouAIEOU].*";

    public StringBuilder findWordWithVowel() {
        String text = InputOutputHelper.getTextFromKey().toString();
        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER);
        StringBuilder stringBuilder = new StringBuilder();
        while (stringTokenizer.hasMoreElements()) {
            String string = stringTokenizer.nextToken();
            if (string.matches(WORD_BEGINS_VOWEL_LETTER)) stringBuilder.append(string).append(" ");
        }
        return stringBuilder;
    }
}
