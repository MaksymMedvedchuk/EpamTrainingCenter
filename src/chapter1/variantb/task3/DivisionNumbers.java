package chapter1.variantb.task3;

import java.util.Scanner;

public class DivisionNumbers {

    public void printNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int capacity = scanner.nextInt();
        int[] number = new int[capacity];
        System.out.print("Enter all the elements: ");
        for (int i = 0; i < capacity; i++) {
            number[i] = scanner.nextInt();
        }
        System.out.println("Numbers divisible by 3: ");
        for (int i = 0; i < capacity; i++) {
            if (number[i] % 3 == 0) {    //чому не можна записати (number[i] / 3)
                System.out.println(number[i]);
            }
        }
        System.out.println("");
        System.out.println("Numbers divisible by 9: ");
        for (int i = 0; i < capacity; i++) {
            if (number[i] % 9 == 0) {
                System.out.println(number[i]);
            }
        }
    }
}
