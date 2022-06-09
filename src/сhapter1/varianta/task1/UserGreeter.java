package сhapter1.varianta.task1;

import java.util.Scanner;
public class UserGreeter {
    public void printHelloUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and to press <Enter>");
        String userInput = scanner.next();
        System.out.println("Hello " + userInput);
    }
}
