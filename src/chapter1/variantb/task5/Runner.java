package chapter1.variantb.task5;

import helper.ScannerHelperInt;

public class Runner {
    public static void main(String[] args) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        bubbleSorter.bobbleSort(ScannerHelperInt.getIntsFromConsole());
    }
}
