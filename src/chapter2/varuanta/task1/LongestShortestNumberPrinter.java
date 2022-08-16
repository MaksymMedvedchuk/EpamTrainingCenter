package chapter2.varuanta.task1;

import java.util.Arrays;

public class LongestShortestNumberPrinter {
    public void printNumbers(String[] numbers) {
        String max = "";
        String min = Arrays.toString(numbers);
        for (String s : numbers) {
            if (s.length() > max.length()) max = s;
            if (s.length() < min.length()) min = s;
        }
        System.out.println("The longest: " + max + " ,length is: " + max.length());
        System.out.println("The shortest: " + min + " ,length is: " + min.length());
    }
}




