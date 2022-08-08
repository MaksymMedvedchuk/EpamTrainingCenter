package chapter1.variantb.task2;

public class LargestSmallestNumbersPrinter {
    public void printNumbers(int[] numbers) {
        int largest = numbers[0]; //ініціалізу перший елемент масиву, щоб було до чого привязатись, щоб почати щось з чим зрівнювати
        int smallest = numbers[0];
        for (int number : numbers) {
            if (number > largest)
                largest = number;//перевіряємо кожний елемент і якщо він більший, то присвоюємо нове значення і так далі, поки не пройдемо весь масив
            if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Max: " + largest);
        System.out.println("Min: " + smallest);
    }
}





