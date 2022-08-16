package chapter1.variantb.task9;

import java.util.Arrays;
import java.util.Comparator;

public class SortNumberPrinter {
    public void printAscendingNumbers(int[] numbers) {
        System.out.println("Numbers in Ascending Order: ");
        Arrays.stream(Arrays.copyOf(numbers, numbers.length))
                .sorted().forEach(System.out::println);
        System.out.println();
    }

    public void printDescendingNumbers(int[] numbers) {
        System.out.println("Numbers in Descending Order: ");
        Arrays.stream(numbers).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .forEach(System.out::println);
    }
}


// .stream створюємо послідовний потік numbers, .stream повернатає Integer
// .boxed() перетворює стрим примітивів в обєктний тип (пакуємо в обгортку)
//Comparator використовується в методах сортування
//.mapToInt повертає інти і приймає в себе функціональний інтерфейс
//і у Integer визиваємо intValue (повертає нам значення як int)
//передаємо значення до масиву
// Arrays.toString для перетворення масива в строку

//Промежуточные операции следует воспринимать как «отложенные», т.е. они не меняют сами данные, а только задают правила
// их изменения. А терминальные как раз инициируют всю цепочку преобразований, закрывают поток и возвращают модифицированные
// данные. Закрытый поток повторно использовать нельзя. Термінальні потрібно, щоб потік працював
