package сhapter1.varianta.task5;

import java.util.Scanner;

public class CountsSumsArgs {
    private static final int NUN1 = 5;
    private static final int NUN2 = 10;

    public void printSumsArgs() {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int NUN1 = scanner.nextInt();
            int NUN2 = scanner.nextInt();

            System.out.println("Sum= " + (NUN1 + NUN2));


        }

    }


}
