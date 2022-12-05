package chapter10;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class NumberWithDigitsReverseOrder {

    public void printNumberWithDigitsReverseOrder(String number) {
        Deque<Character> numbers = new LinkedList<>();
        for (int i = 0; i < number.length(); i++) {
            numbers.push(number.charAt(i));
        }
        while (numbers.size() > 0) {
            System.out.print(numbers.pop());
        }
    }
}
