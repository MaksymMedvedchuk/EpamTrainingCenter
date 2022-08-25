package chapter2.varianta.task7;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        DifferentDigitsNumbersPrinter digitsNumbersPrinter = new DifferentDigitsNumbersPrinter();
        digitsNumbersPrinter.printNumbers(ScannerHelper.getStringsFromConsole());
    }
}
