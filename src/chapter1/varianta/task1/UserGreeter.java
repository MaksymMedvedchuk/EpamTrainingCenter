package chapter1.varianta.task1;

import java.util.Scanner;

public class UserGreeter {
    public void printHelloUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre your name and press enter");
        String userName = scanner.nextLine();
        System.out.println("Hello" + userName);


    }
}
