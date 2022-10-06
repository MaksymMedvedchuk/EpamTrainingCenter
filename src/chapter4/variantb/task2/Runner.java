package chapter4.variantb.task2;

import chapter4.variantb.task2.sweets.Candy;
import chapter4.variantb.task2.sweets.Chocolate;

public class Runner {
    public static void main(String[] args) {
        Candy firstCandy = new Candy("Chamomile", 10.5, 0.5);
        Candy secondCandy = new Candy("Barberry", 8.8, 0.7);
        Candy thirdCandy = new Candy("Cock", 9.5, 0.9);
        Chocolate chocolate = new Chocolate("Mars", 50, 1.5);
        NewYearGift newYearGift = new NewYearGift();
        newYearGift.addSweet(firstCandy);
        newYearGift.addSweet(secondCandy);
        newYearGift.addSweet(thirdCandy);
        newYearGift.addSweet(chocolate);
        newYearGift.getGiftWeight();
        System.out.println();
        System.out.println(newYearGift.sortCandy());
        System.out.println();
        System.out.println(newYearGift.getCandy());
    }
}
