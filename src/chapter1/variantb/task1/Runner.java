package chapter1.variantb.task1;

import helper.HelperScanner;

public class Runner {
    public static void main(String[] args) {
        NumbersEvenAndOddPrinter numbersEvenAndOddPrinter = new NumbersEvenAndOddPrinter();
        numbersEvenAndOddPrinter.printNumbers(HelperScanner.getIntFromConsole());
    }
}
