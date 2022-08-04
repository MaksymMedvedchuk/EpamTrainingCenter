package chapter1.varianta.task5;

public class SumAndMultiplePrinter {
    private int sum = 0;  //типу тут ноль, щоб при додаванні аргументів в нас не врахувався ноль?
    private int multiple = 1;  //а тут один, щоб ми множенні вргументів 1 не врахувалась?

    public void printerArgsSumAndProduct(String[] args) {
        for (String arg : args) {
            sum += Integer.parseInt(arg);   //перепризначаємо sum нове значення і кожен раз додаємо аргумент який ми вели?
            multiple *= Integer.parseInt(arg);
        }
        System.out.println("Sum = " + sum);
        System.out.println("Multiple = " + multiple);
    }
}





//parseInt цей метод просто для перетворення строково згаченя в числове?







