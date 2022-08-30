package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public void print(String[] numbers) {
        List<Integer> list = Arrays.stream(numbers)
                .filter(this::isPalindrome)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        if (list.size() >= 2){
            System.out.println(list.get(1));
        }
        else {
            System.out.println(list.get(0));
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




















