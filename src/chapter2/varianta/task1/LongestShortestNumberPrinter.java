package chapter2.varianta.task1;

public class LongestShortestNumberPrinter {
    public void printNumbers(String[] numbers) {
        String max = "";
        String min = numbers[0];
        for (String s : numbers) {
            if (s.length() > max.length()) max = s;
            if (s.length() < min.length()) min = s;
        }
        System.out.println("The longest: " + max + " ,length is: " + max.length());
        System.out.println("The shortest: " + min + " ,length is: " + min.length());
    }
}




