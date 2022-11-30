package chapter10;

import java.util.Stack;

public class NumberWithDigitsReverseOrder {

    private static final int NUMBER = 645892314;

    public void printNumberWithDigitsReverseOrder() {

    }

    public void reverseNumber(String number) {
        Stack<Character> numbers = new Stack<>();
        for (int i = 0; i < number.length(); i++) {
            numbers.push(number.charAt(i));
        }
        while (numbers.size() > 0) {
            System.out.print(numbers.pop());
        }
    }
}
