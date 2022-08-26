package chapter2.varianta.task4;

import helper.DifferentQuantityDigitsHelper;

public class MinDifferentDigitsNumbersPrinter {
    public void printNumbers(String[] numbers) {
        int minQuantity = 10;
        String resultNumber = "";
        for (String number : numbers) {
            int quantity = new DifferentQuantityDigitsHelper().getDifferentDigitsQuantity(number);
            if (minQuantity > quantity) {
                minQuantity = quantity;
                resultNumber = number;
            }
        }
        System.out.println(resultNumber);
    }
}












