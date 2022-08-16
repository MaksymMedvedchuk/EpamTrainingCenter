package chapter1.variantb.task7;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        GreatestDivisorLeastMultipleNumbersPrinter numbersPrinter = new GreatestDivisorLeastMultipleNumbersPrinter();
        int[] consoleArgs = ScannerHelperInt.getIntsFromConsole();
        numbersPrinter.printLeastCommonMultiple(consoleArgs);
        numbersPrinter.printGreatestCommonDivisor(consoleArgs);
    }
}
