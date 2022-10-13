package chapter5.task15;

public class Runner {
    public static void main(String[] args) {
        Computer.ComputerInfo computerInfo = new Computer.ComputerInfo("Windows 7", "AMD Ryzen 7 2700X", "Kingston FURY DDR5-4800");
        Computer computer = new Computer(computerInfo);
        System.out.println(computer);
    }
}
