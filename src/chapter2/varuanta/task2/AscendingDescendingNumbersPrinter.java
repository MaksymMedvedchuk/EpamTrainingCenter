package chapter2.varuanta.task2;

import java.util.Arrays;
import java.util.Comparator;

public class AscendingDescendingNumbersPrinter {
    public void printAscendingNumbers(String[] numbers) {
        System.out.println("Numbers in Ascending Order: ");
        Arrays.stream(numbers).
                mapToInt(Integer::parseInt).          //mapToInt отримати потік типу int і в дужках строки конвертим в інти
                sorted().forEach(System.out::println);
        System.out.println();
    }

    public void printDescendingNumbers(String[] numbers) {
        System.out.println("Numbers in Descending Order: ");
        Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .boxed()//викор boxed щоб запакувати в обгортку, бо sorted(Comparator.reverseOrder() прауює тільки з обєктами?
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}




