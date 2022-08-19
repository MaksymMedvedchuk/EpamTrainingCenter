package chapter2.varianta.task6;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        AscendingOrderNumberPrinter ascendingOrderNumberPrinter = new AscendingOrderNumberPrinter();
        ascendingOrderNumberPrinter.printNumbers(ScannerHelper.getStringFromConsole());
    }
}
