package chapter2.varuanta.task4;

import helper.ScannerHelperString;

public class Runner {
    public static void main(String[] args) {
        MinDifferentDigitsNumbersPrinter digitsNumbersPrinter = new MinDifferentDigitsNumbersPrinter();
        digitsNumbersPrinter.printNumbers(ScannerHelperString.getIntsFromConsole());
    }
}
