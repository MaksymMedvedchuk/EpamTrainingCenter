package chapter9.varianta;

import helper.InputOutputHelper;
import helper.ParsingTextHelper;

public class WordsWithVowelPrinter {

    private static final String WORD_BEGINS_VOWEL_LETTER_REGEX = "^[aieouyAIEOUY].*";

    public void printWordWithVowel() {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        StringBuilder stringBuilder = new StringBuilder();
        for (String someString : ParsingTextHelper.getParsingText()) {
            if (someString.matches(WORD_BEGINS_VOWEL_LETTER_REGEX)) stringBuilder.append(someString).append(" ");
            inputOutputHelper.printTextToOutputFile(stringBuilder.toString());
        }
    }
}
