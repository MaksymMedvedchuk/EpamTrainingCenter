package chapter1.variantb.task16;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        PascalTriangleNumbers pascalTriangleNumbers = new PascalTriangleNumbers();
        pascalTriangleNumbers.printerNumbers(ScannerHelper.getIntsFromConsole());
    }
}
