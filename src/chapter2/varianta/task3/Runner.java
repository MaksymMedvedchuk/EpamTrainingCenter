package chapter2.varianta.task3;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        LengthGreaterLessAverageNumbersPrinter lessAverageNumbersPrinter = new LengthGreaterLessAverageNumbersPrinter();
        lessAverageNumbersPrinter.printNumbers(ScannerHelper.getStringFromConsole());
    }
}
