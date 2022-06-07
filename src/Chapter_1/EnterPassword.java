package Chapter_1;
import java.util.Scanner;
//Ввести пароль из командной строки и сравнить его со строкой-образцом.

public class EnterPassword {
    static String password = "123456";
    static String yourPassword;
    static String ImputYourPassword() {
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
    public static void main(String[] args) {
        ImputYourPassword();
        ComparePasswords();
    }
}
