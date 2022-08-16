package chapter2.varuanta.task1;

import helper.ScannerHelperString;

public class Runner {
    public static void main(String[] args) {
        LongestShortestNumberPrinter longestShortestNumberPrinter = new LongestShortestNumberPrinter();
        longestShortestNumberPrinter.printNumbers(ScannerHelperString.getIntsFromConsole());
    }
}
