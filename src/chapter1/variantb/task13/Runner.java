package chapter1.variantb.task13;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        PalindromeNumbersPrinter palindromeNumbersPrinter = new PalindromeNumbersPrinter();
        palindromeNumbersPrinter.printerNumbers(ScannerHelper.getIntsFromConsole());
    }
}
