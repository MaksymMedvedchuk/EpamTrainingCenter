package chapter1.varianta.task5;

public class SumAndProductPrinter {

    public void printerArgsSumAndProduct(String[] args) {
        int sum = 0;  //типу тут ноль, щоб при додаванні аргументів в нас не врахувався ноль?
        int product = 1;
        for (String arg : args) {
            sum += Integer.parseInt(arg);   // на першій ітерації sum 0 = 0 + 2 = 2, друга в нас все sum =2 => 2 = 2 + 4 = 4, аналогічно с множенням
            product *= Integer.parseInt(arg);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiple = " + product);
    }
}










