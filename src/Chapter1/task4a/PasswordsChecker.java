package Chapter1.task4a;
import java.util.Scanner;


public class PasswordsChecker {
    static String password = "123456";
    static String yourPassword;
    static String InputYourPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password ");
        yourPassword = scanner.nextLine();
        System.out.println("Your Password " + yourPassword);
        return yourPassword;
    }
    static void ComparePasswords() {
        if (password.equals(yourPassword))
            System.out.println("Your Password is true");
        else
            System.out.println("Your Password is false");
    }
    public void printComparePassword() {
        InputYourPassword();
        ComparePasswords();
    }
}
