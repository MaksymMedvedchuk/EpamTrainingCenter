package chapter1.variantb.task3and4;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        DivisionNumbersPrinter divisionNumbersPrinter = new DivisionNumbersPrinter();
        divisionNumbersPrinter.printNumbers(ScannerHelper.getIntsFromConsole());
    }
}
