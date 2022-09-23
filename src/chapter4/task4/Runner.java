package chapter4.task4;

public class Runner {
    public static void main(String[] args) {
        City kyiv = new City("Kyiv", true, true);
        City lviv = new City("Lviv", true);
        City lutck = new City("Lutck", true);
        City irpin = new City("Rodatichi");

        District kievskiy = new District("Kievskiy");
        District lvivskiy = new District("Lvivskiy");
        District lutskiy = new District("Lutskiy");

        kievskiy.addCity(kyiv);
        kievskiy.addCity(irpin);
        lvivskiy.addCity(lviv);
        lutskiy.addCity(lutck);

        Region kievska = new Region("Kievskaya", 50256.25);
        Region lvivska = new Region("Lvivska", 45692.48);
        Region lutska = new Region("Lutska", 35254.25);
        kievska.addDistrict(kievskiy);
        lvivska.addDistrict(lvivskiy);
        lutska.addDistrict(lutskiy);

        Country ukraine = new Country("Ukraine");

        ukraine.addRegion(kievska);
        ukraine.addRegion(lvivska);
        ukraine.addRegion(lutska);
        ukraine.printRegionsQuantity();
        System.out.println();
        ukraine.printCountryArea();
        System.out.println();
        ukraine.printRegionCentres();
        System.out.println();
        ukraine.printCountryCapital();
    }
}
