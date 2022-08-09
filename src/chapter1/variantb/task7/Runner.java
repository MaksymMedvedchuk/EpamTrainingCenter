package chapter1.variantb.task7;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        GreatestDivisorLeastMultipleNumbersPrinter numbersPrinter = new GreatestDivisorLeastMultipleNumbersPrinter();
        numbersPrinter.printGreatestCommonDivisor(ScannerHelper.getIntsFromConsole());
        numbersPrinter.printLeastCommonMultiple(ScannerHelper.getIntsFromConsole());
    }
}
