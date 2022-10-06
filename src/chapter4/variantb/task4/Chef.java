package chapter4.variantb.task4;

import chapter4.variantb.task4.vegetables.Vegetables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Chef {
    private final List<Vegetables> vegetablesList = new ArrayList<>();

    public void addVegetables(Vegetables vegetables){
        vegetablesList.add(vegetables);
    }

    public int getCalorieCount(){
        int amountCalorie = 0;
        for (Vegetables vegetables : vegetablesList) {
            amountCalorie += vegetables.getCalorie();
        }
        return amountCalorie;
    }

    public List<Vegetables> getVegetablesCalorie(){
        return vegetablesList
                .stream()
                .sorted(Comparator.comparing(Vegetables::getCalorie))
                .collect(Collectors.toList());
    }

    public List<Vegetables> sortVegetablesCalorie(){
        return vegetablesList
                .stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Vegetables> findVegetablesCalorieContent (){
        List<Vegetables> list = new ArrayList<>();
        for (Vegetables vegetables : vegetablesList) {
            if (vegetables.getCalorie() < 15 && vegetables.getCalorie() > 9){
                list.add(vegetables);
            }
        }
        return list;
    }
}
