package chapter2.varianta.task4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinDifferentDigitsNumbersPrinter {
    public void printNumbers(String[] numbers) {
       // Arrays.stream(numbers)
                //.filter(x -> isDifferent(x))


    }

    private int isDifferent(String input) { //чому int в нас же differentDigits це char
        Set<Character> differentDigits = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            differentDigits.add(input.charAt(i));
        }
        return differentDigits.size();
    }

}












