package chapter1.variantb.task9;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        SortNumberPrinter sortNumberPrinter = new SortNumberPrinter();
        int[] consoleArgs = ScannerHelper.getIntsFromConsole();
        sortNumberPrinter.printAscendingNumbers(consoleArgs);
        sortNumberPrinter.printDescendingNumbers(consoleArgs);
    }
}
