package Chapter_1;

import java.util.Scanner;
////Приветствовать любого пользователя при вводе его имени через командную строку

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and to press <Enter>");
        String string = scanner.next();
        System.out.println("Hello " + string);
    }
}
