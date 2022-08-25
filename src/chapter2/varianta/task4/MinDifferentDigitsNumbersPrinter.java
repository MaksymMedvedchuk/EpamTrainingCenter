package chapter2.varianta.task4;

import java.util.HashSet;
import java.util.Set;

public class MinDifferentDigitsNumbersPrinter {
    public void printNumbers(String[] numbers) {
        int minQuantity = 10;
        String resultNumber = "";
        for (String number : numbers) {
            int quantity = getDifferentDigitsNumber(number);
            if (minQuantity > quantity) {
                minQuantity = quantity;
                resultNumber = number;
            }
        }
        System.out.println(resultNumber);
    }


    private int getDifferentDigitsNumber(String input) {
        Set<Character> differentDigits = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            differentDigits.add(input.charAt(i));
        }
        return differentDigits.size();
    }
}












