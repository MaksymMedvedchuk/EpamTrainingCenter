package chapter1.variantb.task9;

import java.util.Arrays;
import java.util.Comparator;

public class SortNumberPrinter {
    public void printAscendingNumbers(int[] numbers) {
        System.out.println("Numbers in Ascending Order: ");
        Arrays.stream(numbers)
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }

    public void printDescendingNumbers(int[] numbers) {
        System.out.println("Numbers in Descending Order: ");
        Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);
    }
}

