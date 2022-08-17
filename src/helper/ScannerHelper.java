package helper;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerHelper {
    public static int[] getIntsFromConsole() {
        Scanner scanner = new Scanner(new FilterInputStream(System.in) {
            @Override
            public void close() throws IOException {
            }
        });
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt(); //scanner.nextInt() метод зчитує число, яке ми ввели і присвоює його size
        int[] numbers = new int[size]; //створюємо масив int з дожиною size
        System.out.print("Enter all the elements: "); //заповнюємо масив
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); //заповнюємо масив елементами, які вводимо з клавіатури
        }
        scanner.close();
        return numbers;
    }

    public static String[] getStringFromConsole() {
        Scanner scanner = new Scanner(new FilterInputStream(System.in) {
            @Override
            public void close() throws IOException {
            }
        });
        System.out.print("Enter number of elements: ");
        String size = scanner.nextLine();
        System.out.print("Enter all the elements: ");
        String line = scanner.nextLine();
        return line.split(" ");
    }
}


//Це ж звичайний метод? Ми його бачим в будь-якому класі, тому що public? Типу присвоюємо цей клас змінній і визиваєм його метод?
