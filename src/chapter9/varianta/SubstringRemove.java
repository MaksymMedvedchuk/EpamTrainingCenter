package chapter9.varianta;

import helper.InputOutputHelper;

public class SubstringRemove {

    public String removeGivenSubstring(String inputSubstring) {
        String formattedString = null;
        String text = InputOutputHelper.getTextFromKey().toString();
        if (text.contains(inputSubstring))
            formattedString = text.replaceAll(inputSubstring, "");
        return formattedString;
    }
}






