package chapter1.variantb.task1;

import java.util.Scanner;

public class EvenOddNumbers {

    public void printNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt(); //scanner.nextInt() метод зчитує число, яке ми ввели і присвоює його size
        int numbers[] = new int[size]; //створюємо масив int з дожиною size
        System.out.print("Enter all the elements: "); //заповнюємо масив
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); //заповнюємо масив елементами, які вводимо з клавіатури
        }
        System.out.print("Odd numbers: ");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.print("Even numbers: ");
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}





