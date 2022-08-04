package chapter1.variantb.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddNumbers { //без Printer, тому що цей має поля EVEN та ODD,

    private final static ArrayList<Integer> EVEN = new ArrayList<>(); //Нам не треба вказувати його розмір, бо він розширюється. Так в попередньому прикладі, ми теж не вказували розмір масиву?
    private final static ArrayList<Integer> ODD = new ArrayList<>(); //робимо через масив, бо в нього є медов .add і через нього ми можемо просто додати число в лиcт?

    public void printNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt(); //scanner.nextInt() метод зчитує число, яке ми ввели і присвоює його size
        int[] numbers = new int[size]; //створюємо масив int з дожиною size
        System.out.print("Enter all the elements: "); //заповнюємо масив
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); //заповнюємо масив елементами, які вводимо з клавіатури
        }
        for (int number : numbers) {
            if (number % 2 == 0) EVEN.add(number);
            else ODD.add(number);
        }
        System.out.print("Even numbers: ");
        for (Integer i : EVEN) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Odd numbers: ");
        for (Integer i : ODD) {
            System.out.print(i + " ");
        }
    }
}


//        System.out.print("Odd numbers: ");
//        for (int i = 0; i < size; i++) {
//            if (numbers[i] % 2 != 0) {
//                System.out.print(numbers[i] + " ");
//            }
//        }
//        System.out.println(" ");
//        System.out.print("Even numbers: ");
//
//        for (int i = 0; i < size; i++) {
//            if (numbers[i] % 2 == 0) {
//                System.out.print(numbers[i] + " ");
//            }
//        }
//    }








