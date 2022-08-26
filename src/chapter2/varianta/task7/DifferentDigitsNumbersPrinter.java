package chapter2.varianta.task7;

import helper.DifferentQuantityDigitsHelper;

import java.util.ArrayList;
import java.util.List;

public class DifferentDigitsNumbersPrinter {
    public void printNumbers(String[] numbers) {
        List<String> differentDigitsNumbers = new ArrayList<>();
        for (String number : numbers) {
            int quantity = new DifferentQuantityDigitsHelper().getDifferentDigitsQuantity(number);
            if (quantity == number.length()) {
                differentDigitsNumbers.add(number);
            }
        }
        System.out.println(differentDigitsNumbers.get(0));
    }
}


