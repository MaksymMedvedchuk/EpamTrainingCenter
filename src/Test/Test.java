package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void sortByMaxMinNumberOfChars(String[] numbers) {
//        Arrays.stream(numbers)
//                .filter(Test::isDigits)
//                .forEach(System.out::println);
//
//    }
//        private static boolean isDigits(String input) {
//        for (int i = 0; i < input.length(); i++) {
//            for (int j = i + 1; j < input.length(); j++) {
//                if (input.charAt(i) == input.charAt(j))
//                    return false;
//            }
//        }
//        return true;
//    }
//}


        ArrayList<String> differentDigits = new ArrayList<>();
        for (String number : numbers) {
            if (isDigits(number))
                differentDigits.add(number);
        }
        if (differentDigits.isEmpty()) {
            System.out.println("not differentDigits");

        } else {
            System.out.println(differentDigits.get(0));
        }
    }

    private static boolean isDigits(String number) {
        for (int i = 0; i < number.length(); i++) {
            for (int j = i + 1; j < number.length(); j++) {
                if (number.charAt(i) == number.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
}







