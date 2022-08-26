package chapter2.varianta.task8;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumberPrinter {
    public void printerNumbers(String[] numbers) {
        List<Integer> palindromesList = new ArrayList<>();
        for (String number : numbers) {
            if (isPalindrome(number)) {
                int palindromeNumber = Integer.parseInt(number);
                palindromesList.add(palindromeNumber);
            }
        }
        if (palindromesList.size() >= 2) {
            System.out.println("Palindrome numbers is: " + palindromesList.get(1));
        } else {
            System.out.println("Palindrome numbers is: " + palindromesList.get(0));
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


//        List <String> list = new ArrayList<>();
//        Arrays.stream(numbers)
//                .filter(this::isPalindrome)
//                .mapToInt(Integer::parseInt)
//
//                .forEach(x -> {
//                    if (list.size() >= 2) {
//                        System.out.println(list.get(1));
//                    } else {
//                        System.out.println(list.get(0));
//                    }
//                });
//    }
