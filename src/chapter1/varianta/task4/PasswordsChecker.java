package chapter1.varianta.task4;

import java.util.Scanner;

public class PasswordsChecker {
    private static final String PASSWORD = "123456";

    private String readPassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter password ");
        String yourPassword = scanner.nextLine();
        System.out.println("Your Password " + yourPassword);
        return yourPassword;
    }

    private void printComparePasswords(String inputPassword) {
        if (PASSWORD.equals(inputPassword))
            System.out.println("Your Password is true");
        else
            System.out.println("Your Password is false");
    }

    public void printComparePassword() {
        String inputPassword = readPassword();
        printComparePasswords(inputPassword);
    }

    public static class Runner {
        public static void main(String[] args) {
            PasswordsChecker passwordsChecker = new PasswordsChecker();
            passwordsChecker.printComparePassword();

        }
    }
}
