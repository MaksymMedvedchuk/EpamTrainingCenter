package chapter1.variantb.task16;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleNumbers {
    public void printerNumbers(int[] numbers) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        for (int number : numbers) {
            if (number <= 0)
                return;
            prev.add(1);
            res.add(prev);
            if (number == 1)
                return;
            prev.add(1);
            res.add(prev);
            if (number == 2)
                return;
            int k = 3;
            while (k <= number) {
                Integer[] arr = prev.toArray(new Integer[0]);
                curr.clear();
                curr.add(1);
                for (int i = 0; i < arr.length - 1; i++) {
                    curr.add(arr[i] + arr[i + 1]);
                }
                curr.add(1);
                for (int i : curr)
                    System.out.print(i + " ");
                System.out.print("\n");
                res.add(curr);
                prev = curr;
                k++;
            }
        }
    }
}
