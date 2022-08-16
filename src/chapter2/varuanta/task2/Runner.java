package chapter2.varuanta.task2;

import helper.ScannerHelperString;

public class Runner {
    public static void main(String[] args) {
        AscendingDescendingNumbersPrinter ascendingDescendingNumbersPrinter = new AscendingDescendingNumbersPrinter();
        String[] consoleArgs = ScannerHelperString.getIntsFromConsole();
        ascendingDescendingNumbersPrinter.printAscendingNumbers(consoleArgs);
        ascendingDescendingNumbersPrinter.printDescendingNumbers(consoleArgs);
    }
}
