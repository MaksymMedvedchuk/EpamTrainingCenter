package chapter1.variantb.task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromeNumbersPrinter {
    public void printerNumbers(int[] numbers) {
        Arrays.stream(numbers).mapToObj(Integer::toString)
                .filter(e -> isNumberPalindrome(e))
                .forEach(e -> System.out.println("Palindrome number: " + e));
    }

    private boolean isNumberPalindrome(String number) {
        String palindromeNumber = "";
        for (int i = number.length() - 1; i >= 0; i--) {
            palindromeNumber += number.charAt(i);
        }
        return number.equals(palindromeNumber);
    }
}
//    public void printerNumbers(int[] numbers) {
//        List<StringBuilder> list = new ArrayList<StringBuilder>();
//        for (Integer number : numbers) {
//            StringBuilder sb = new StringBuilder(number.toString());
//            if (sb.toString().equals(sb.reverse().toString())) {
//                list.add(sb);
//            }
//        }
//        System.out.println("Palindrome numbers: " + list);
//    }






















//Arrays.stream створення стріма із масиву