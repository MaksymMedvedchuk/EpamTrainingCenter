package chapter2.varianta.task8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeNumberPrinter {
    public void printerNumbers(String[] numbers) {
        List<Integer> palindromeList = Arrays.stream(numbers)
                .filter(this::isPalindrome)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        if (palindromeList.isEmpty()) System.out.println("Not palindrome numbers!");
        else {
            System.out.println("Palindrome number: " + (palindromeList.size() >= 2 ? + palindromeList.get(1) :
                    +palindromeList.get(0)));
        }
    }

    private boolean isPalindrome(String input) {
        StringBuilder palindromeNumber = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            palindromeNumber.append(input.charAt(i));
        }
        return input.equals(palindromeNumber.toString());
    }
}
