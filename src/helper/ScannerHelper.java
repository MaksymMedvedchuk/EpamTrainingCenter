package helper;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerHelper {
    public static int[] getIntsFromConsole() {
        Scanner scanner = getClosedScanner();
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
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



