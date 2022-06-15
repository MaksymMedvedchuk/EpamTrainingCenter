package сhapter1.varianta.task3;

public class RandomNumbersPrinter {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final int QUANTITY = 10;

    public void printRandomNumbers(boolean isWithTransition) {
        for (int i = 0; i < QUANTITY; i++) {
            int randomNumberWith = MIN + (int) (Math.random() * MAX);
            if (isWithTransition)
                System.out.print(randomNumberWith + " ");
            else {
                System.out.println(randomNumberWith);
            }

        }
    }
}



