package chapter9.varianta;

import helper.InputOutputHelper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubstringRemove {

    public String removeGivenSubstring(String inputSubstring) {
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(InputOutputHelper.getTextFromFile("inputFile")))) {
            String stringFromText;
            while ((stringFromText = bufferedReader.readLine()) != null) list.add(stringFromText);
            String formattedString = null;
            for (String stringOfText : list) {
                if (stringOfText.contains(inputSubstring))
                    formattedString = stringOfText.replaceAll(inputSubstring, "");
                return formattedString;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return InputOutputHelper.getTextFromFile("inputFile");
    }
}





