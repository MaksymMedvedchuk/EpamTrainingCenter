package chapter10;

import java.util.HashSet;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        StringReversePrinter stringReversePrinter = new StringReversePrinter();
        stringReversePrinter.printStringInReverse();

        NumberWithDigitsReverseOrder number = new NumberWithDigitsReverseOrder();
        //number.printNumberWithDigitsReverseOrder("1234567");

//        SetHelper<Integer> setHelper = new SetHelper<>();
//        Set<Integer> firstSet = new HashSet<>();
//        firstSet.add(1);
//        firstSet.add(2);
//        firstSet.add(8);
//        Set<Integer> secondSet = new HashSet<>();
//        secondSet.add(1);
//        secondSet.add(2);
//        secondSet.add(5);
//        System.out.println(setHelper.intersectSets(firstSet, secondSet));
//        System.out.println(setHelper.unionSets(firstSet, secondSet));
    }
}
