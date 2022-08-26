package test;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

public class Test {
    public static String getMonthForInt(int num) {
        String month = "wrong";
        DateFormatSymbols dfs = new DateFormatSymbols();
        String[] months = dfs.getMonths();
        if (num >= 0 && num <= 11 ) {
            month = months[num];
        }
        return month;
    }




 //   public void print(String[] numbers) {
//        try {
//            for (String number : numbers) {
//                int x = Integer.parseInt(number);
//                String monthName = new DateFormatSymbols().getMonths()[x - 1];
//                System.out.println(monthName);
//
//            }
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("No month");
//            e.printStackTrace();
//        }
    }




















