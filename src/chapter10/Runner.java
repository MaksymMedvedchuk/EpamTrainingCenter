package chapter10;

public class Runner {
    public static void main(String[] args) {
        StringReversePrinter stringReversePrinter = new StringReversePrinter();
//        stringReversePrinter.expandString();

        NumberWithDigitsReverseOrder number = new NumberWithDigitsReverseOrder();
        number.reverseNumber("1236548");
    }
}
