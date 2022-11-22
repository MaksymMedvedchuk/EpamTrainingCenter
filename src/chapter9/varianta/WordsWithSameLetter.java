package chapter9.varianta;

import helper.InputOutputHelper;

import java.util.StringTokenizer;

public class WordsWithSameLetter {

    private static final String DELIMITER = " ,.!;:?";

    public void printWordsWithSameLastAndFirstLetterFollowOneAnother() {
        String text = InputOutputHelper.getTextFromKey().toString();
        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER);
        StringBuilder stringBuilder = new StringBuilder();
        while (stringTokenizer.hasMoreElements()) {
            String string = stringTokenizer.nextToken();
            for (int i = 0; i < string.length(); i++) {

            }
        }
    }
}







