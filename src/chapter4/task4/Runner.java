package chapter4.task4;

public class Runner {
    public static void main(String[] args) {
        Country country = new Country();
        country.setCapitalName("kYiv");
        country.printCountryCapital();
        Region region1 = new Region("Kyivsliy", 45021.5, "Kyiv");
        Region region2 = new Region("Sumskiy", 69012.5, "Sumi");
        Region region3 = new Region("Luckiy", 35624.25, "Luck");
        Region region4 = new Region("Lvivskiy", 50364.25, "Lviv");
        country.addRegions(region1);
        country.addRegions(region2);
        country.addRegions(region3);
        country.addRegions(region4);
        country.printQuantityRegions();
        country.printCountryArea();
        country.printRegionCentres();
    }
}
