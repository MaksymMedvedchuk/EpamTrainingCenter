package chapter1.variantb.task2;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        LargestSmallestNumbersPrinter largestSmallestNumbersPrinter = new LargestSmallestNumbersPrinter();
        largestSmallestNumbersPrinter.printNumbers(ScannerHelperInt.getIntsFromConsole());
    }
}
