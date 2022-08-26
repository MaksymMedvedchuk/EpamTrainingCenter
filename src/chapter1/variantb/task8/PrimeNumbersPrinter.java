package chapter1.variantb.task8;

import java.util.Arrays;

public class PrimeNumbersPrinter {
    public void printPrimeNumbers(int[] numbers) {
        Arrays.stream(numbers)
                .boxed()
                .filter(this::isPrime)
                .forEach(e -> System.out.println("Prime number: " + e + " "));
        System.out.println();
    }

    private boolean isPrime(int input) {
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}






