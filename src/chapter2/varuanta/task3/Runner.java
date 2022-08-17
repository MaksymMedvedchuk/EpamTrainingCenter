package chapter2.varuanta.task3;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        LengthGreaterLessAverageNumbersPrinter lessAverageNumbersPrinter = new LengthGreaterLessAverageNumbersPrinter();
        lessAverageNumbersPrinter.printNumbers(ScannerHelper.getStringFromConsole());
    }
}
