package chapter1.variantb.task8;

import java.util.ArrayList;

public class PrimeNumbersPrinter {
    public void printPrimeNumbers(int[] numbers) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)) {
                primeNumbers.add(number);
            }
        }
        System.out.print("Prime numbers: ");
        primeNumbers.forEach(e -> System.out.print(e + " "));
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





