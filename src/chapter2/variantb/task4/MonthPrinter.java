package chapter2.variantb.task4;

import java.text.DateFormatSymbols;
import java.util.Locale;

public class MonthPrinter {

    public void printMonth(int input) throws IndexOutOfBoundsException {
        try {
            String monthName = new DateFormatSymbols(Locale.ENGLISH).getMonths()[input];
            System.out.println(input + " " + monthName);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Month not found!");
            e.printStackTrace();
        }
    }
}



