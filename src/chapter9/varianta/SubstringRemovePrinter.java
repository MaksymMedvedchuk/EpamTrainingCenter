package chapter9.varianta;

import helper.InputOutputHelper;

public class SubstringRemovePrinter {

    //В каждой строке найти и удалить заданную подстроку.

    public void removeGivenSubstring(String inputSubstring) {
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        String formattedString = null;
        String text = inputOutputHelper.getTextFromInputFile();
        if (text.contains(inputSubstring))
            formattedString = text.replaceAll(inputSubstring, "");
        printInfo(formattedString);
        inputOutputHelper.setTextToOutputFile(formattedString);
    }

    private void printInfo(String formattedString) {
        System.out.println(formattedString);
    }
}






