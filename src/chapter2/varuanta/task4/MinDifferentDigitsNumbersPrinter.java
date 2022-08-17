package chapter2.varuanta.task4;

import java.util.ArrayList;

public class MinDifferentDigitsNumbersPrinter {
    private static boolean isDigits(String number) {
        int i = 0;
        while (i < number.length()) {
            i++;
        }
        return true;
    }

    public void printNumbers(String[] numbers) {
        ArrayList<String> differentDigits = new ArrayList<>();
        for (String number : numbers) {
            if (isDigits(number))
                differentDigits.add(number);
        }
        System.out.println(differentDigits.get(0));
    }
}












