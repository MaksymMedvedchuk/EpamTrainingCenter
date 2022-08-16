package chapter1.variantb.task3and4;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        DivisionNumbersPrinter divisionNumbersPrinter = new DivisionNumbersPrinter();
        divisionNumbersPrinter.printNumbers(ScannerHelperInt.getIntsFromConsole());
    }
}
