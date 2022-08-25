package chapter2.varianta.task7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferentDigitsNumbersPrinter {
    public void printNumbers(String[] numbers) {
        List <String> differentDigitsNumbers = new ArrayList<>();
        for (String number : numbers) {
            int quantityNumber = getDifferentDigitsNumbers(number);
            if (quantityNumber == number.length()) {
                differentDigitsNumbers.add(number);
            }
        }
        System.out.println(differentDigitsNumbers.get(0));
    }

    public int getDifferentDigitsNumbers(String input) {
        Set<Character> differentNumbers = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            differentNumbers.add(input.charAt(i));
        }
        return differentNumbers.size();
    }
}


