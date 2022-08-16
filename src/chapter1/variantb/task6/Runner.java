package chapter1.variantb.task6;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        ThreeDigitNumberPrinter threeDigitNumberPrinter = new ThreeDigitNumberPrinter();
        threeDigitNumberPrinter.printerNumbers(ScannerHelperInt.getIntsFromConsole());
    }
}
