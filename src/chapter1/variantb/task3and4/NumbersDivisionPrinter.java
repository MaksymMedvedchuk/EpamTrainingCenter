package chapter1.variantb.task3and4;

import helper.HelperScanner;

import java.util.ArrayList;

public class NumbersDivisionPrinter {

    public void printNumbers() {
        int[] numbers = HelperScanner.getIntFromConsole();

        ArrayList<Integer> division3 = new ArrayList<>();
        ArrayList<Integer> division5And7 = new ArrayList<>();

        for (int number : numbers) {
            if (number % 3 == 0) division3.add(number);
            if (number % 5 == 0 && number % 7 == 0) division5And7.add(number);
        }
        System.out.print("Numbers that are division into the 3: ");
        for (Integer i : division3) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Numbers that are division into the 5 and 7: ");
        for (Integer i : division5And7) {
            System.out.print(i + " ");
        }
    }
}





