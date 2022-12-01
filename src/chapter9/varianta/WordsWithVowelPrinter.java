package chapter9.varianta;

import helper.InputOutputHelper;

import java.util.StringTokenizer;

public class WordsWithVowelPrinter {

    private static final String DELIMITER = " ,.!;:?";
    private static final String WORD_BEGINS_VOWEL_LETTER_REGEX = "^[aieouyAIEOUY].*";

    //В каждой строке найти слова, начинающиеся с гласной буквы

    public void findWordWithVowel() {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String text = inputOutputHelper.getTextFromInputFile();
        StringBuilder stringBuilder = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER);
        while (stringTokenizer.hasMoreElements()) {
            String string = stringTokenizer.nextToken();
            if (string.matches(WORD_BEGINS_VOWEL_LETTER_REGEX)) {
                stringBuilder.append(string).append(" ");
                inputOutputHelper.setTextToOutputFile(stringBuilder.toString());
            }
        }
        printInfo(stringBuilder);
    }

    private void printInfo(StringBuilder stringBuilder) {
        System.out.println(stringBuilder);
    }
}
