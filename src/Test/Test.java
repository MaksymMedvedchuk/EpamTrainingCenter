package Test;

import java.util.Scanner;


public class Test {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of elements in the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.print("Enter all the elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
            int max = numbers[0]; //ініціалізу перший елемент масиву, щоб було до чого привязатись, щоб почати щось з чим зрівнювати
            int min = numbers[0];
            for (int i = 0; i < size; i++ ) {
                if (numbers[i] > max) max = numbers[i];//перевіряємо кожний елемент і якщо він більший, то присвоюємо нове значення і так далі, поки не пройдемо весь масив
                if (numbers[i] < min) min = numbers[i];
            }
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

        }



        }




