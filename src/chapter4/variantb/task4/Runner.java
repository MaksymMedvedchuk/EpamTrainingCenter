package chapter4.variantb.task4;

import chapter4.variantb.task4.vegetables.Cabbage;
import chapter4.variantb.task4.vegetables.Cucumber;
import chapter4.variantb.task4.vegetables.Onion;
import chapter4.variantb.task4.vegetables.Tomato;

public class Runner {
    public static void main(String[] args) {
        Cabbage cabbage = Cabbage.createCabbage(10, "Green");
        Tomato tomato = new Tomato(5, "Red");
        Onion onion = new Onion(11, "White");
        Cucumber cucumber = new Cucumber(8, "Green");
        Chef chef = new Chef();
        chef.addVegetables(cabbage);
        chef.addVegetables(tomato);
        chef.addVegetables(onion);
        chef.addVegetables(cucumber);
        System.out.println("Calorie of salad: " + chef.getCalorieCount());
        System.out.println(chef.getVegetablesCalorie());
        System.out.println();
        System.out.println(chef.sortVegetablesCalorie());
        System.out.println();
        System.out.println(chef.findVegetablesCalorieContent());
    }
}
