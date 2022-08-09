package chapter1.variantb.task9;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        NumbersSorted numbersSorted = new NumbersSorted();
        numbersSorted.printNumbers(ScannerHelper.getIntsFromConsole());
    }
}
