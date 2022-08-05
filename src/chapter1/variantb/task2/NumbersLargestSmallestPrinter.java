package chapter1.variantb.task2;

import helper.HelperScanner;

import java.util.Scanner;

public class NumbersLargestSmallestPrinter {
    public void printNumbers() {
        int[] numbers = HelperScanner.getIntFromConsole();
        int largest = numbers[0]; //ініціалізу перший елемент масиву, щоб було до чого привязатись, щоб почати щось з чим зрівнювати
        int min  = numbers[0];
        for (int number : numbers) {//тут с першого єлементу, бо [0] ми вже ініціалізували
            if (number > largest)
                largest = number;//перевіряємо кожний елемент і якщо він більший, то присвоюємо нове значення і так далі, поки не пройдемо весь масив
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Max: " + largest);
        System.out.println("Min: " + min);
    }
}





