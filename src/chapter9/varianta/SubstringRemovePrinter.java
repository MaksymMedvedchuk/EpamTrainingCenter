package chapter9.varianta;

import helper.InputOutputHelper;

public class SubstringRemovePrinter {

    public String removeGivenSubstring(String inputSubstring) {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String formattedString = null;
        String text = inputOutputHelper.getTextFromInputFile();
        if (text.contains(inputSubstring))
            formattedString = text.replaceAll(inputSubstring, "");
        return formattedString;
    }
}






