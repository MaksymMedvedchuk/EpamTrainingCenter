package chapter10;

import java.util.Stack;

public class NumberWithDigitsReverseOrder {

    //Ввести число, занести его цифры в стек. Вывести число, у которого цифры
    //идут в обратном порядке

    public void printNumberWithDigitsReverseOrder(String number) {
        Stack<Character> numbers = new Stack<>();
        for (int i = 0; i < number.length(); i++) {
            numbers.push(number.charAt(i));
        }
        while (numbers.size() > 0) {
            System.out.print(numbers.pop());
        }
    }
}
