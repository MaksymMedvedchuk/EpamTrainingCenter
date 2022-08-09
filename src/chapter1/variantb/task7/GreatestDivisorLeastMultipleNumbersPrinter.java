package chapter1.variantb.task7;

public class GreatestDivisorLeastMultipleNumbersPrinter {
    private int printGreatestCommonDivisor(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void printGreatestCommonDivisor(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = printGreatestCommonDivisor(result, numbers[i]);
        }
        System.out.println("Greatest common divisor: " + result);
    }

    private int printLeastCommonMultiple(int a, int b) {
        return a * (b / printGreatestCommonDivisor(a, b));
    }

    public void printLeastCommonMultiple(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if ((numbers[i] == 0 || numbers[0] == 0)
                    || (numbers[i] < 0 || numbers[0] < 0)) {
                break;
            }
            result = printLeastCommonMultiple(result, numbers[i]);
        }
        System.out.println("Least common multiple: " + result);
    }
}
