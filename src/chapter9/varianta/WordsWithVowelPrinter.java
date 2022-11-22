package chapter9.varianta;

import helper.InputOutputHelper;

import java.util.StringTokenizer;

public class WordsWithVowelPrinter {

    private static final String DELIMITER = " ,.!;:?";
    private static final String WORD_BEGINS_VOWEL_LETTER_REGEX = "^[aieouAIEOU].*";

    public void findWordWithVowel() {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String text = inputOutputHelper.getTextFromInputFile();
        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER);
        StringBuilder stringBuilder = new StringBuilder();
        while (stringTokenizer.hasMoreElements()) {
            String string = stringTokenizer.nextToken();
            if (string.matches(WORD_BEGINS_VOWEL_LETTER_REGEX)) stringBuilder.append(string).append(" ");
            inputOutputHelper.setTextToFile(stringBuilder.toString());
        }
    }
}
