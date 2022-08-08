package chapter1.variantb.task2;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        LargestSmallestNumbersPrinter largestSmallestNumbersPrinter = new LargestSmallestNumbersPrinter();
        largestSmallestNumbersPrinter.printNumbers(ScannerHelper.getIntsFromConsole());
    }
}
