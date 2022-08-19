package chapter2.varianta.task2;

import helper.ScannerHelper;

public class Runner {
    public static void main(String[] args) {
        AscendingDescendingNumbersPrinter ascendingDescendingNumbersPrinter = new AscendingDescendingNumbersPrinter();
        String[] consoleArgs = ScannerHelper.getStringFromConsole();
        ascendingDescendingNumbersPrinter.printAscendingNumbers(consoleArgs);
        ascendingDescendingNumbersPrinter.printDescendingNumbers(consoleArgs);
    }
}
