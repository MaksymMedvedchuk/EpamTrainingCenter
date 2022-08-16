package chapter1.variantb.task1;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        EvenAndOddNumbersPrinter evenAndOddNumbersPrinter = new EvenAndOddNumbersPrinter();
        evenAndOddNumbersPrinter.printNumbers(ScannerHelperInt.getIntsFromConsole());
    }
}
