package chapter2.varuanta.task3;

import helper.ScannerHelperString;

public class Runner {
    public static void main(String[] args) {
        LengthGreaterLessAverageNumbersPrinter lessAverageNumbersPrinter = new LengthGreaterLessAverageNumbersPrinter();
        lessAverageNumbersPrinter.printNumbers(ScannerHelperString.getIntsFromConsole());
    }
}
