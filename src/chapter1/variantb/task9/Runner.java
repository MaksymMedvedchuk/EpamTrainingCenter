package chapter1.variantb.task9;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        SortNumberPrinter sortNumberPrinter = new SortNumberPrinter();
        int[] consoleArgs = ScannerHelperInt.getIntsFromConsole();
        sortNumberPrinter.printAscendingNumbers(consoleArgs);
        sortNumberPrinter.printDescendingNumbers(consoleArgs);
    }
}
