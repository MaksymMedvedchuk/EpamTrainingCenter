package chapter1.variantb.task6;

import java.util.ArrayList;

public class ThreeDigitNumberPrinter {
    public void printerNumbers(int[] numbers) {
        String number;
        ArrayList <Integer> list = new ArrayList<>();
        for (Integer integer : numbers) {
            number = integer.toString();
            if (number.length() == 3 && number.charAt(0) != number.charAt(1) && number.charAt(1) != number.charAt(2) && number.charAt(0) != number.charAt(2)) {
                list.add(integer);
            }
        }
        System.out.println(list);
    }
}

//ArrayList не працює з примітивами, і тому створюємо String змінну, щоб через неї елементу масиву передати строкове значення через toString і потім порівнювати числа самого числа?


