package chapter2.varianta.task4;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        MinDifferentDigitsNumbersPrinter digitsNumbersPrinter = new MinDifferentDigitsNumbersPrinter();
        digitsNumbersPrinter.printNumbers(ScannerHelper.getStringsFromConsole());
    }
}
