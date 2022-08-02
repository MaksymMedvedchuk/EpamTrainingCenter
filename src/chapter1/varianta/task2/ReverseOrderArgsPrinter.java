package chapter1.varianta.task2;

public class ReverseOrderArgsPrinter {
    public void reverseOrderArgsPrinter(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
