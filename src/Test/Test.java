package Test;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] array = {101, 111, 123};
        print(array);


    }

    public static void print(Integer [] numbers){
        String number;
        AbstractList <Integer> list = new ArrayList<>();
        for (Integer integer : numbers) {
            number= Arrays.toString(numbers);
            if (number.length() == 3 && number.charAt(0) != number.charAt(1) && number.charAt(1) != number.charAt(2) && number.charAt(0) != number.charAt(2)){
                list.add(integer);

            }
        }
        System.out.println(list);



    }

}








