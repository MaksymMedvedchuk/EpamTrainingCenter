package chapter1.variantb.task9;

import java.util.Arrays;

public class NumbersSorted {

    public void printNumbers(int[] numbers) {
        Arrays.sort(numbers);
        System.out.print("Numbers in Ascending Order:");
        for (int number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println();
        System.out.print("Numbers in Descending Order: ");
        for (int i  = numbers.length - 1; i >= 0; i--){
            System.out.print(" " + numbers[i]);
        }
    }
}