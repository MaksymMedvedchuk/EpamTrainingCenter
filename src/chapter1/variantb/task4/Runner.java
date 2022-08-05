package chapter1.variantb.task4;

import helper.HelperScanner;

public class Runner {
    public static void main(String[] args) {
        BobbleSort bobbleSort = new BobbleSort();
        bobbleSort.sortBobble(HelperScanner.getIntFromConsole());
    }
}
