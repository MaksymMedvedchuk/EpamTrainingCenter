package chapter1.variantb.task8;

import java.util.Arrays;

public class PrimeNumbersPrinter {
    public void printPrimeNumbers(int[] numbers) {
        Arrays.stream(numbers).boxed()
                .filter(number -> isPrime(number))
                .forEach(e -> System.out.println("Prime number: " + e + " "));
        System.out.println();
    }

    private boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}






