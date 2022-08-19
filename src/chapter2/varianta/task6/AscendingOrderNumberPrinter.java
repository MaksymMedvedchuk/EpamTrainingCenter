package chapter2.varianta.task6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AscendingOrderNumberPrinter {
    public void printNumbers(String[] numbers) {
        List<String> list = Arrays.asList(numbers);//asList формує список на основі масива
        Optional<Integer> increasingNumbers = list.stream()//NullPointerExceptions
                .filter(this::getOrderlyIncreaseDigits)
                .map(Integer::parseInt)
                .sorted()
                .findFirst();
               //.reduce(Integer::min);//метод min повертає клас Math в якому обчислюється найменше поточне значення?//reduce повертає результат операції
        if (increasingNumbers.isPresent()) {
            System.out.println(increasingNumbers.get()); //чому не можна визвати get в самому потоку?
        } else {
            System.out.println("Not ascending order number");
        }
    }

    public boolean getOrderlyIncreaseDigits(String input) {
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) - input.charAt(i - 1) != 1)
                return false;
        }
        return true;
    }
}



//Array цей клас можна використовувати для створення масиву
//Arrays службовий клас, який містить статичні методи для маніпулювання значеннями, що зберігаються в масиві.


