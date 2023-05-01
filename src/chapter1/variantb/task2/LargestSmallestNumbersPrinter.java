package chapter1.variantb.task2;

public class LargestSmallestNumbersPrinter {
    public void printNumbers(int[] numbers) {
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number > largest)
                largest = number;
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Max: " + largest);
        System.out.println("Min: " + smallest);
    }
}





