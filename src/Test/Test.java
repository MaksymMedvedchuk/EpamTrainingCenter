package Test;

import java.util.Arrays;

public class Test {

    public void sortBobble(int[] numbers) {
        int n = numbers.length;
        int tem;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    tem = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}







