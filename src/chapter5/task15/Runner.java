package chapter5.task15;

public class Runner {
    public static void main(String[] args) {
        Computer.ComputerInner computerInner = new Computer.ComputerInner("Windows 7", "AMD Ryzen 7 2700X", "Kingston FURY DDR5-4800");
        System.out.println(computerInner);
    }
}
