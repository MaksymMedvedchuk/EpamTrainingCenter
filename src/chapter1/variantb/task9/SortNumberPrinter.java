package chapter1.variantb.task9;

import java.util.Arrays;
import java.util.Comparator;

public class SortNumberPrinter {
    public void printAscendingNumbers(int[] numbers) {
        Arrays.sort(numbers);
        System.out.print("Numbers in Ascending Order:");
        for (int number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println();
    }

    public void printDescendingNumbers(int[] numbers) {
        System.out.print("Numbers in Descending Order: ");
        int[] numberReverse = Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.print(Arrays.toString(numberReverse));
    }
}


// .copyOf передаємо наш оригінальний масив
// .stream створюємо послідовний потік numbers, .stream повернатає Integer
// .boxed() перетворює стрим примітивів в обєктний тип (пакуємо в обгортку)
//Comparator використовується в методах сортування
//.mapToInt повертає інти і приймає в себе функціональний інтерфейс
//і у Integer визиваємо intValue (повертає нам значення як int)
//передаємо значення до масиву
// Arrays.toString для перетворення масива в строку
