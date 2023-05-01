package chapter1.varianta.task5;

public class SumAndProductPrinter {

    public void printerArgsSumAndProduct(String[] args) {
        int sum = 0;
        int product = 1;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
            product *= Integer.parseInt(arg);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiple = " + product);
    }
}










