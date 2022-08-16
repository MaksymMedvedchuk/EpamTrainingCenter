package helper;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerHelperString {
    public static String[] getIntsFromConsole() {
        Scanner scanner = new Scanner(new FilterInputStream(System.in) {
            @Override
            public void close() throws IOException {
            }
        });
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        return numbers;
        //scanner.close();

//        System.out.print("Enter number of elements: ");
//        int size = scanner.nextInt();
//        String [] numbers = new String [size];
//        System.out.print("Enter all the elements: ");
//        for (int i = 0; i < numbers.length; i++) {
//            String userInput = scanner.next();//зчитує кожне число до пробіла, таким чином, пробіл в нас не читається як за строку
//            numbers[i] = userInput;
//        }
//        scanner.close();
//        return numbers;
//    }
    }
}


