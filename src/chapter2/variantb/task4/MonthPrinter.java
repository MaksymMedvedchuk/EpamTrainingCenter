package chapter2.variantb.task4;

public class MonthPrinter {

    public void printMonth(int input) throws IndexOutOfBoundsException {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        try {
            String month = months[input - 1];
            System.out.println("This month is: " + month);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Month not found!");
            e.printStackTrace();
        }
    }
}



