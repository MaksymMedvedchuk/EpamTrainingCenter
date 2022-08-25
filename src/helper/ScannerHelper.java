package helper;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerHelper {
    public static int[] getIntsFromConsole() {
        Scanner scanner = getClosedScanner();
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt(); //scanner.nextInt() метод зчитує число, яке ми ввели і присвоює його size
        int[] numbers = new int[size]; //створюємо масив int з дожиною size
        System.out.print("Enter numbers: "); //заповнюємо масив
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt(); //заповнюємо масив елементами, які вводимо з клавіатури
        }
        scanner.close();
        return numbers;
    }

    public static String[] getStringsFromConsole() {
        Scanner scanner = getClosedScanner();
        System.out.print("Enter separate elements: ");
        String line = scanner.nextLine();
        return line.split(" ");
    }

    private static Scanner getClosedScanner() {
        return new Scanner(new FilterInputStream(System.in) {
            @Override
            public void close() throws IOException {
            }
        });
    }
}



