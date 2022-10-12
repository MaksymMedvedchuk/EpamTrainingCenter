package chapter4.variantb.task2;

import chapter4.variantb.task2.sweets.Candy;
import chapter4.variantb.task2.sweets.Chocolate;
import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        Candy firstCandy = new Candy("Chamomile", BigDecimal.valueOf(10.5), BigDecimal.valueOf(0.5));
        Candy secondCandy = new Candy("Barberry", BigDecimal.valueOf(8.8), BigDecimal.valueOf(0.7));
        Candy thirdCandy = new Candy("Cock", BigDecimal.valueOf(9.5), BigDecimal.valueOf(0.9));
        Chocolate chocolate = new Chocolate("Mars", BigDecimal.valueOf(50), BigDecimal.valueOf(1.5));
        NewYearGift newYearGift = new NewYearGift();
        newYearGift.addSweet(firstCandy);
        newYearGift.addSweet(secondCandy);
        newYearGift.addSweet(thirdCandy);
        newYearGift.addSweet(chocolate);
        newYearGift.printGiftWeight();
        System.out.println();
        System.out.println(newYearGift.getCandiesSortByWeight());
        System.out.println();
        System.out.println(newYearGift.getCandyByBetween(BigDecimal.valueOf(0.9), BigDecimal.valueOf(0.6)));
    }
}
