package chapter4.varianta.task5;

public class Runner {
    public static void main(String[] args) {
        Mainland mainland = new Mainland("Eurasia");
        Planet planet = new Planet();
        planet.addMainLand(mainland);
        planet.setName("Mars");
        System.out.println(planet.getName());
        planet.printMainlandName();
        planet.printMainlandQuantity();
    }
}
