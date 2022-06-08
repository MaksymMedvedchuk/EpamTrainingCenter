package Chapter1.task3a;

public class RandomNumbersPrinter {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private static final int QUANTITY = 10;

    public void withOutTransitionToTerm() {
    //public void withTransitionToTerm() {
        for (int i = 0; i < QUANTITY; i++) {
            int randomNumberWith = MIN + (int) (Math.random() * MAX);
            System.out.print(" " + randomNumberWith);

                }
            }
        }



