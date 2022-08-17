package chapter1.variantb.task6;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        ThreeDigitNumberPrinter threeDigitNumberPrinter = new ThreeDigitNumberPrinter();
        threeDigitNumberPrinter.printerNumbers(ScannerHelper.getIntsFromConsole());
    }
}
