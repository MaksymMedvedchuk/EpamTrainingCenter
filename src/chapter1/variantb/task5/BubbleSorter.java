package chapter1.variantb.task5;

import java.util.Arrays;

public class BubbleSorter {

    public void bobbleSort(int[] numbers) {

        int length = numbers.length;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 1; j < length; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int tem = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}





