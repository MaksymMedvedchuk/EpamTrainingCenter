package chapter2.varianta.task2;

import java.util.Arrays;
import java.util.Comparator;

public class AscendingDescendingNumbersPrinter {
    public void printAscendingNumbers(String[] numbers) {
        System.out.println("Numbers in Ascending Order: ");
        Arrays.stream(numbers)
                .map(Integer::parseInt)
                .sorted().forEach(System.out::println);
        System.out.println();
    }

    public void printDescendingNumbers(String[] numbers) {
        System.out.println("Numbers in Descending Order: ");
        Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}




