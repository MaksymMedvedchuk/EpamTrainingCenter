package chapter4.variantb.task4;

import chapter4.variantb.task4.vegetables.Cabbage;
import chapter4.variantb.task4.vegetables.Cucumber;
import chapter4.variantb.task4.vegetables.Onion;
import chapter4.variantb.task4.vegetables.Tomato;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {

        Cabbage cabbage = Cabbage.createCabbage(10, BigDecimal.valueOf(0.5));
        Tomato tomato = new Tomato(5, BigDecimal.valueOf(0.3));
        Onion onion = new Onion(11, BigDecimal.valueOf(0.7));
        Cucumber cucumber = new Cucumber(8, BigDecimal.valueOf(0.8));
        Salad salad = new Salad();
        salad.addVegetable(cabbage);
        salad.addVegetable(tomato);
        salad.addVegetable(onion);
        salad.addVegetable(cucumber);
        System.out.println("Calorie of salad: " + salad.getCalorieCount());
        System.out.println(salad.getVegetablesSortByCalorie());
        System.out.println();
        System.out.println(salad.getVegetablesSortBySalt());
        System.out.println();
        System.out.println(salad.getVegetablesCalorieBetween(9,15));
    }
}
