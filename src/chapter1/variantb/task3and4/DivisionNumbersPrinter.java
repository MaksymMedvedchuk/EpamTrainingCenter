package chapter1.variantb.task3and4;

import java.util.ArrayList;

public class DivisionNumbersPrinter {

    public void printNumbers(int[] numbers) {
        ArrayList<Integer> division3 = new ArrayList<>();
        ArrayList<Integer> division5And7 = new ArrayList<>();
        for (int number : numbers) {
            if (number % 3 == 0) division3.add(number);
            if (number % 5 == 0 && number % 7 == 0) division5And7.add(number);
        }
        System.out.print("Numbers that are division into the 3: ");
        division3.forEach(System.out::println);
        System.out.println();
        System.out.print("Numbers that are division into the 5 and 7: ");
        division5And7.forEach(System.out::println);
    }
}





