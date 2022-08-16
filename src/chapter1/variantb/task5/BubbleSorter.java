package chapter1.variantb.task5;

import java.util.Arrays;

public class BubbleSorter {

    public void bobbleSort(int[] numbers) {

        int length = numbers.length;
        for (int i = length - 1; i > 0; i--) { //скорочується тому що вн цикл після кожної ітерації в кінець ставить найбільше число
            for (int j = 1; j < length; j++) {
                if (numbers[j] < numbers[j - 1]) {  //порівнює з попереднім і якщо він більний(якщо правий менше лівого), то умова виконується і ми їх міеяєм місцями
                    int tem = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}





