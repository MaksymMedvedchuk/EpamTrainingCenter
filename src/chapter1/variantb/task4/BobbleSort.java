package chapter1.variantb.task4;

import java.util.Arrays;

public class BobbleSort {

    public void sortBobble(int[] numbers) {

        int number = numbers.length;
        for (int i = number - 1; i > 0; i--) { //скорочується тому що вн цикл після кожної ітерації в кінець ставить найбільше число
            for (int j = 1; j < number; j++) {
                if (numbers[j] < numbers[j - 1]) {  //порівнює з попереднім і якщо він більний(якщо правий менше лівого), то умова виконується і ми їх міеяєм місцями
                    int tem = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}

//Післ першої ітепації найбільни ел-нт буде в кінці завжди?



//        boolean isSorted = false; //мітка, що масив відсортувався, тобто елементи не міняються містами, поки це false
//        while (!isSorted) {  //поки масив не вілсортован
//            isSorted = true; //вважаємо, що масив відсортован,  якщо є перестановка кидаєм в false (16 рядок)
//            for (int i = 0; i < numbers.length - 1; i++) { //numbers.length - 1 зрівнюємо і та і+1, і щоб не вийти за межі масиву, то довжина -1
//                if (numbers[i] > numbers[i + 1]) {
//                    int temp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = temp;
//                    isSorted = false;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(numbers));
//    }
//}

