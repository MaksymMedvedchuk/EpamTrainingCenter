package chapter1.variantb.task5;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        BubbleSorter bubbleSorter = new BubbleSorter();
        bubbleSorter.bobbleSort(ScannerHelper.getIntsFromConsole());
    }
}
