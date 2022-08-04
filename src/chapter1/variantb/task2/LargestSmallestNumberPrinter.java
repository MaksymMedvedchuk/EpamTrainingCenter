package chapter1.variantb.task2;

import java.util.Scanner;

public class LargestSmallestNumberPrinter {
    public void printNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of elements in the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter all the elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0]; //ініціалізу перший елемент масиву, щоб було до чого привязатись, щоб почати щось з чим зрівнювати
        int min = numbers[0];
        for (int i = 0; i < size; i++) {
            if (numbers[i] > max)
                max = numbers[i];//перевіряємо кожний елемент і якщо він більший, то присвоюємо нове значення і так далі, поки не пройдемо весь масив
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}


//    private int smallest = Integer.MAX_VALUE;  //через Integer, щоб обробляло додатні та відємні значення
//    private int largest = Integer.MIN_VALUE;   //
//
//    public void printNumbers() {
//        System.out.print("Enter the number of elements: ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt(); //зчитує і повертає число яке ми ввели і присвоює його змінній number
//        // Коли ви викликаєте sc.close() у методі, він не лише закриває ваш сканер, але й закриває вхідний потік System.in і надалі він не використовується наступними обєктами
//        System.out.print("Enter numbers: ");
//        for (int i = 0; i < number; i++) {
//            int current = scanner.nextInt();  //зчитує і по черзі повертає число яке ми ввели і перевіряє його
//            if (current > largest) { //порівнює кожен раз число які вводили з найбільшим //Тобто if сам шукає найбільш число і воно полюбому буде більше largest = Integer.MIN_VALUE????
//                largest = current;
//            }
//            if (current < smallest) { //порівнює кожен раз число які вводили з найменшим
//                smallest = current;
//            }
//        }
//        System.out.println("Largest number is: " + largest);
//        System.out.println("Smallest number is: " + smallest);
//    }





