package chapter1.variantb.task1;

import helper.HelperScanner;

import java.util.ArrayList;

public class NumbersEvenAndOddPrinter {

    public void printNumbers(int[] numbers) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) even.add(number);
            else odd.add(number);
        }
        System.out.print("Even numbers: ");
        for (Integer i : even) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (Integer i : odd) {
            System.out.print(i + " ");
        }
    }
}










