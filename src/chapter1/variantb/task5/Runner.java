package chapter1.variantb.task5;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        BobbleSorter bobbleSorter = new BobbleSorter();
        bobbleSorter.bobbleSort(ScannerHelper.getIntsFromConsole());
    }
}
