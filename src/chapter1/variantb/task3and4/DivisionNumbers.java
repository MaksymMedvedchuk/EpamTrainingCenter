package chapter1.variantb.task3and4;

import java.util.ArrayList;
import java.util.Scanner;

public class DivisionNumbers {

    private final static ArrayList<Integer> DIVISION_3_OR_9 = new ArrayList<>();
    private final static ArrayList<Integer> DIVISION_5_AND_7 = new ArrayList<>();

    public void printNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of elements in the array: ");
        int capacity = scanner.nextInt();
        int[] numbers = new int[capacity];
        System.out.print("Enter all the elements: ");
        for (int i = 0; i < capacity; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int number : numbers) {
            if (number % 3 == 0 || number % 9 == 0) DIVISION_3_OR_9.add(number); //чому не можна number / 3
            if (number % 5 == 0 && number % 7 == 0) DIVISION_5_AND_7.add(number);
        }
        System.out.print("Numbers that are division into the 3 or 9: ");
        for (Integer i : DIVISION_3_OR_9) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Numbers that are division into the 5 and 7: ");
        for (Integer i : DIVISION_5_AND_7) {
            System.out.print(i + " ");
        }
    }
}





