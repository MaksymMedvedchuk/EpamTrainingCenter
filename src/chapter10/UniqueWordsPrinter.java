package chapter10;

import helper.InputOutputHelper;
import helper.ParsingTextHelper;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsPrinter {

    public void printerUniqueWords() {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        Set<String> uniqueStrings = new HashSet<>();
        for (String someString : ParsingTextHelper.getParsingText()) {
            uniqueStrings.add(someString.toLowerCase());
        }
        inputOutputHelper.printTextToOutputFile(uniqueStrings.toString());
    }
}
