package chapter1.variantb.task13;

import java.util.Arrays;

public class PalindromeNumbersPrinter {
    public void printerNumbers(int[] numbers) {
        Arrays.stream(numbers)
                .mapToObj(Integer::toString)
                .filter(this::isPalindrome)
                .forEach(e -> System.out.println("Palindrome number: " + e));
    }

    private boolean isPalindrome(String input) {
        StringBuilder palindromeNumber = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            palindromeNumber.append(input.charAt(i));
        }
        return input.equals(palindromeNumber.toString());
    }
}






















//Arrays.stream створення стріма із масиву