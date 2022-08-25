package chapter2.variantb.task4;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        MonthPrinter monthPrinter = new MonthPrinter();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int numberMonth = scanner.nextInt();
        monthPrinter.printMonth(numberMonth);
    }
}
