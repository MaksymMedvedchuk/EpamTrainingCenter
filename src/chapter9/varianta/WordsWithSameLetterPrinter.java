package chapter9.varianta;

import helper.InputOutputHelper;
import helper.ParsingTextHelper;

import java.util.ArrayList;
import java.util.List;

public class WordsWithSameLetterPrinter {

    private static final String WORD_REGEX = "[a-zA-Z]+";

    public void printWordsWithSameLastAndFirstLetterFollowOneAnother() { //зробив хелпер на токінайзер
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (String someString : ParsingTextHelper.getParsingText()) {
            if (someString.matches(WORD_REGEX)) list.add(someString);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).charAt(list.get(i).length() - 1) == list.get(i + 1).charAt(0)) {
                stringBuilder.append(list.get(i)).append(" ").append(list.get(i + 1)).append(" ");
                inputOutputHelper.printTextToOutputFile(stringBuilder.toString());
            }
        }
    }
}


















