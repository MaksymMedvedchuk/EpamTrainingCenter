package chapter2.varianta.task8;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        PalindromeNumberPrinter palindromeNumberPrinter = new PalindromeNumberPrinter();
        palindromeNumberPrinter.printerNumbers(ScannerHelper.getStringFromConsole());
    }
}
