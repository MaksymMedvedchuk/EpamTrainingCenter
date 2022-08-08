package chapter1.variantb.task1;

import java.util.ArrayList;

public class EvenAndOddNumbersPrinter {

    public void printNumbers(int[] numbers) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int number : numbers) {
            if (number % 2 == 0) even.add(number);
            else odd.add(number);
        }
        System.out.print("Even numbers: ");
        even.forEach(e -> System.out.print(e + " "));
        System.out.println();
        System.out.print("Odd numbers: ");
        odd.forEach(e -> System.out.print(e + " "));
        }
    }















