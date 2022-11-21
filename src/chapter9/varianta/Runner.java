package chapter9.varianta;

import helper.InputOutputHelper;

public class Runner {

    public static void main(String[] args) {
        SubstringRemove substringRemove = new SubstringRemove();
        System.out.println(substringRemove.removeGivenSubstring("las"));
        InputOutputHelper inputOutputHelper = new InputOutputHelper();
        inputOutputHelper.writeTextToFile();
    }
}




