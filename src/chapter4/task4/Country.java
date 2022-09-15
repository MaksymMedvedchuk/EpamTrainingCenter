package chapter4.task4;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String countryName;
    private String capitalName;
    List<Region> regionList = new ArrayList<>();

    public void addRegions(Region region) {
        regionList.add(region);
    }

    public void printCountryCapital() {
            System.out.println(capitalName);
    }

    public void printQuantityRegions() {
        System.out.println(regionList.size());
    }

    public void printCountryArea() {
        double area = 0;
        for (Region region : regionList) {
            area = +area + region.getArea();
        }
        System.out.println(area);
    }

    public void printRegionCentres() {
        for (Region region : regionList) {
            System.out.println(region.getRegionName());
        }
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        if (!capitalName.matches("[a-zA-z]+"))
            throw new IllegalArgumentException("Name of the capital must consist only of letters");
        this.capitalName = capitalName.substring(0, 1).toUpperCase() + capitalName.substring(1).toLowerCase();
    }
}


