package chapter2.varuanta.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscendingDescendingNumbersPrinter {
    public void printAscendingNumbers(String[] numbers) {
        Arrays.sort(numbers);
        System.out.print("Numbers in Ascending Order:");
        for (String number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println();
    }

    public void printDescendingNumbers(String[] numbers) {
        List<String> list = Arrays.asList(numbers);
        List<String> sorted = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted);
    }
}




