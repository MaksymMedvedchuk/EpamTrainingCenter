package chapter9.varianta;

import helper.InputOutputHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class WordsWithSameLetterPrinter {

    private static final String DELIMITER = " ,.!;:?";
    private static final String WORD_REGEX = "[a-zA-Z]+";

    public void printWordsWithSameLastAndFirstLetterFollowOneAnother() {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String text = inputOutputHelper.getTextFromInputFile();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> stringList = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER);
        while (stringTokenizer.hasMoreElements()) {
            String someString = stringTokenizer.nextToken();
            if (someString.matches(WORD_REGEX)) stringList.add(someString);
        }
        for (int i = 0; i < stringList.size() - 1; i++) {
            if (stringList.get(i).charAt(stringList.get(i).length() - 1) == stringList.get(i + 1).charAt(0)) {
                stringBuilder.append(stringList.get(i)).append(" ").append(stringList.get(i + 1)).append(" ");//коди створював в цьому скопі stringBuilder, то додавалась тільки остання пара!!!
                inputOutputHelper.setTextToOutputFile(stringBuilder.toString());
            }
        }
        printInfo(stringBuilder);
    }

    private void printInfo(StringBuilder stringBuilder) {
        System.out.println(stringBuilder);
    }
}


















