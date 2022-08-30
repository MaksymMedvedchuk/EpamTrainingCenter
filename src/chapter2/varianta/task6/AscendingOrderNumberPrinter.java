package chapter2.varianta.task6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AscendingOrderNumberPrinter {
    public void printNumbers(String[] numbers) {
        List<String> list = Arrays.asList(numbers);//asList формує список на основі масива
        Optional<Integer> increasingNumbers = list.stream()//NullPointerExceptions
                .filter(this::getOrderlyIncreasingDigits)
                .map(Integer::parseInt)
                .findFirst();
        System.out.println(increasingNumbers.isPresent() ? increasingNumbers.get() : "Not ascending order number");
    }

    public boolean getOrderlyIncreasingDigits(String input) {
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) - input.charAt(i - 1) != 1)
                return false;
        }
        return true;
    }
}


//    TreeSet<Integer> set = new TreeSet<>();
//        for (String number : numbers) {
//                if (getOrderlyIncreasingDigits(number)) {
//                int i = Integer.parseInt(number);
//                set.add(i);
//                }
//                }
//                System.out.println(set.first());
//                }


//Array цей клас можна використовувати для створення масиву
//Arrays службовий клас, який містить статичні методи для маніпулювання значеннями, що зберігаються в масиві.


