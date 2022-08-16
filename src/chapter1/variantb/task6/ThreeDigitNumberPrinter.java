package chapter1.variantb.task6;

import java.util.Arrays;

public class ThreeDigitNumberPrinter {
    public void printerNumbers(int[] numbers) {
        Arrays.stream(numbers).mapToObj(Integer::toString)
                .filter(e1 -> isThereNoIdenticalDigits(e1))
                .forEach(e -> System.out.println("Number with non-repeating digits: " + e + " "));
        System.out.println();
    }

    private boolean isThereNoIdenticalDigits(String e) {
        return e.length() == 3 && e.charAt(0) != e.charAt(1) && e.charAt(1) != e.charAt(2) && e.charAt(0) != e.charAt(2);
    }
}





