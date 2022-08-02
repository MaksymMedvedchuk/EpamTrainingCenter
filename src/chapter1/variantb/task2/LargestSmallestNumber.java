package chapter1.variantb.task2;

import java.util.Scanner;

public class LargestSmallestNumber {

    private int smallest = Integer.MAX_VALUE;  //через Integer, щоб обробляло додатні та відємні значення
    private int largest = Integer.MIN_VALUE;   //

    public void printNumbers() {
        System.out.print("Enter the number of elements: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); //зчитує і повертає число яке ми ввели і присвоює його змінній number
        System.out.print("Enter numbers: ");
                for (int i = 0; i < number; i++) {
            int current = scanner.nextInt();  //зчитує і по черзі повертає число яке ми ввели і перевіряє його
            if (current > largest) { //порівнює кожен раз число які вводили з найбільшим //Тобто if сам шукає найбільш число і воно полюбому буде більше largest = Integer.MIN_VALUE????
                largest = current;
            }
            if (current < smallest) { //порівнює кожен раз число які вводили з найменшим
                smallest = current;
            }
        }
        System.out.println("Largest number is: " + largest);
        System.out.println("Smallest number is: " + smallest);
        scanner.close();
    }
}



