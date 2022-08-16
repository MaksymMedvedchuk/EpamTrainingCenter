package chapter1.variantb.task8;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        PrimeNumbersPrinter primeNumbersPrinter = new PrimeNumbersPrinter();
        primeNumbersPrinter.printPrimeNumbers(ScannerHelperInt.getIntsFromConsole());

    }
}
