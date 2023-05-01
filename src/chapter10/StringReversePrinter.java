package chapter10;

import helper.InputOutputHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class StringReversePrinter {

    private static final String DELIMITER = "\n";

    public void printStringInReverse() {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String text = inputOutputHelper.getTextFromInputFile();
        List<String> list = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER);
        while (stringTokenizer.hasMoreElements()) {
            String someString = stringTokenizer.nextToken();
            list.add(someString + "\n");
        }
        Collections.reverse(list);
        inputOutputHelper.printTextToOutputFile(list.toString());
    }
}
