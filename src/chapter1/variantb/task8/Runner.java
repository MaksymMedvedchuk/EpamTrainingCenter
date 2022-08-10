package chapter1.variantb.task8;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        PrimeNumbersPrinter primeNumbersPrinter = new PrimeNumbersPrinter();
        primeNumbersPrinter.printPrimeNumbers(ScannerHelper.getIntsFromConsole());
    }
}
