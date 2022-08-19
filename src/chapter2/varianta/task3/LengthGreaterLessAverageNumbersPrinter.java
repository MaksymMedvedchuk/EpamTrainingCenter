package chapter2.varianta.task3;

import java.util.ArrayList;
import java.util.List;

public class LengthGreaterLessAverageNumbersPrinter {
    public void printNumbers(String[] numbers) {
        List<String> lesser = new ArrayList<>();
        List<String> greater = new ArrayList<>();
        double average = 0;
        for (String number : numbers) {
            average += number.length();
        }
        if (numbers.length > 0) average /= numbers.length;
        System.out.printf("Average of all numbers: %.2f", average);
        System.out.println();
        for (String number : numbers) {
            if (number.length() > average) lesser.add(number);
            else greater.add(number);
        }
        System.out.println("Numbers with bigger average:");
        lesser.forEach(e -> System.out.println(e + " lesser: " + e.length()));
        System.out.println("Numbers with less average:");
        greater.forEach(e -> System.out.println(e + " lesser: " + e.length()));
    }
}




