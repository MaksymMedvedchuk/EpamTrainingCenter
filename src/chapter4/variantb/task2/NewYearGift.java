package chapter4.variantb.task2;

import chapter4.variantb.task2.sweets.Candy;
import chapter4.variantb.task2.sweets.Sweets;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NewYearGift {

    private final List<Sweets> sweetsList = new ArrayList<>();

    public void addSweet(Sweets sweets) {
        sweetsList.add(sweets);
    }

    public void getGiftWeight() {
        int giftWeight = 0;
        for (Sweets sweets : sweetsList) {
            giftWeight += sweets.getWeight();
        }
        System.out.println(this + "\n" + "New Year Gift weight: " + giftWeight);
    }

    public List<Candy> sortCandy() {
        List<Candy> candies = new ArrayList<>();
        for (Sweets sweets : sweetsList) {
            if (sweets instanceof Candy) {//являється змінна sweets обєктом класу Candy?
                candies.add((Candy) sweets);//вказуємо. що sweets ссилається на обєкт класу Candy? якщо просто sweets, то помилка
            }
            else {
                System.out.println("Sweets is not an object Candy");
            }
        }
        return candies.stream().sorted(Comparator.comparing(Candy::getWeight)).collect(Collectors.toList());
    }

    public List<Candy> getCandy() {
        List<Candy> candies = new ArrayList<>();
        for (Sweets sweets : sweetsList) {
            if (sweets instanceof Candy && sweets.getSugarContent() > 0.5 && sweets.getSugarContent() < 1.1) {
                candies.add((Candy) sweets);
            }
            else {
                System.out.println("Sweets is not an object Candy");
            }
        }
        return candies;
    }

    public List<Sweets> getSweetList() {
        return sweetsList;
    }

    @Override
    public String toString() {
        return "NewYearGift{" +
                "sweetList=" + sweetsList +
                '}';
    }
}
