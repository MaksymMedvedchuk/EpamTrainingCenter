package Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] numbers) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String max = "";
        String min = line;
        for (String s : line.split(" ")) {
            if (s.length() > max.length()) max = s;
            if (s.length() < max.length()) min = s;


        }

        System.out.println("The longest: " + max + "Length is: " + max.length());
        System.out.println("The shortest: " + min + "Length is: " + min.length());
    }


}
