package chapter1.variantb.task13;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        PalindromeNumbersPrinter palindromeNumbersPrinter = new PalindromeNumbersPrinter();
        palindromeNumbersPrinter.printerNumbers(ScannerHelperInt.getIntsFromConsole());
    }
}
