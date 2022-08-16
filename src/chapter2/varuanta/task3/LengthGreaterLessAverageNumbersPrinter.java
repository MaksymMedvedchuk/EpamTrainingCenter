package chapter2.varuanta.task3;

import java.util.ArrayList;
import java.util.List;

public class LengthGreaterLessAverageNumbersPrinter {
    public void printNumbers(String[] numbers) {
        List<String> length = new ArrayList<>();
        List<String> greater = new ArrayList<>();
        double average = 0;
        for (String number : numbers) {
            average += number.length();
        }
        if (numbers.length > 0) average /= numbers.length;
        System.out.printf("Average length of all numbers: %.2f", average);
        System.out.println();
        for (String number : numbers) {
            if (number.length() > average) length.add(number);
            else greater.add(number);
        }
        System.out.println("Numbers with length bigger average:");
        length.forEach(e -> System.out.println(e + " length: " + e.length()));
        System.out.println("Numbers with length less average:");
        greater.forEach(e -> System.out.println(e + " length: " + e.length()));
    }
}

//птання по лямбді


