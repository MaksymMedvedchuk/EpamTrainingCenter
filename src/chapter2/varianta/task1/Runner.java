package chapter2.varianta.task1;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        LongestShortestNumberPrinter longestShortestNumberPrinter = new LongestShortestNumberPrinter();
        longestShortestNumberPrinter.printNumbers(ScannerHelper.getStringsFromConsole());
    }
}
