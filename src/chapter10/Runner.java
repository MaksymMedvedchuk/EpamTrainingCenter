package chapter10;

import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        StringReversePrinter stringReversePrinter = new StringReversePrinter();
       // stringReversePrinter.expandString();

        NumberWithDigitsReverseOrder number = new NumberWithDigitsReverseOrder();
        //number.printNumberWithDigitsReverseOrder("1234567");

        SetChecker setChecker = new SetChecker();
        setChecker.defineIntersectionSets(Collections.singleton("1, 2, 3"), Collections.singleton("1, 2, 4"));
    }
}
