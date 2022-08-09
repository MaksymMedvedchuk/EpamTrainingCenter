package chapter1.variantb.task6;

import java.util.ArrayList;

public class ThreeDigitNumberPrinter {
    public void printerNumbers(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer integer : numbers) {
            String number = integer.toString();
            if (isThereNoIdenticalNumbers(number)) {
                list.add(integer);
            }
        }
        System.out.println(list);
    }

    private boolean isThereNoIdenticalNumbers(String number) {
        return number.length() == 3 && number.charAt(0) != number.charAt(1) && number.charAt(1) != number.charAt(2) &&
                number.charAt(0) != number.charAt(2);
    }
}




