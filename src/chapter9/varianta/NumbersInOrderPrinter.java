package chapter9.varianta;

import helper.InputOutputHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NumbersInOrderPrinter {

    private static final String DELIMITER = " ,.!;:?";
    private static final String NUMBER_REGEX = "[a-zA-Z]+";

    public void findMaxConsecutiveDigits(){
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String text = inputOutputHelper.getTextFromInputFile();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> stringList = new ArrayList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(text, DELIMITER);
        while (stringTokenizer.hasMoreElements()) {
            String someString = stringTokenizer.nextToken();
            if (!someString.matches(NUMBER_REGEX)) stringList.add(someString);
        }
        for (int i = 0; i < stringList.size(); i++) {

        }
      


    }
}
