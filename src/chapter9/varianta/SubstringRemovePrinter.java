package chapter9.varianta;

import helper.InputOutputHelper;

public class SubstringRemovePrinter {

    public void removeGivenSubstring(String inputSubstring) {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String formattedString = null;
        String text = inputOutputHelper.getTextFromInputFile();
        if (text.contains(inputSubstring))
            formattedString = text.replaceAll(inputSubstring, "");
        System.out.println(formattedString);
        inputOutputHelper.setTextToFile(formattedString);
    }
}






