package chapter2.varianta.task8;

import java.util.Arrays;

public class PalindromeNumberPrinter {
    public void printerNumbers(String[] numbers) {
        Arrays.stream(numbers)
                .filter(this::isPalindrome)
                .limit(2)
                .forEach(System.out::println);
    }

    private boolean isPalindrome(String input) {
        StringBuilder palindromeNumber = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            palindromeNumber.append(input.charAt(i));
        }
        return input.equals(palindromeNumber.toString());
    }
}
