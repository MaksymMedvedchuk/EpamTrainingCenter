package chapter4.task4;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String countryName;
    List<Region> regionList = new ArrayList<>();

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public void addRegion(Region region) {
        regionList.add(region);
    }

    public void printCountryCapital() {
        for (Region region : regionList) {
            for (District district : region.getDistrictList()) {
                for (City city : district.getCityList()) {
                    if (city.isCapital()) System.out.println(city);
                    }
                }
            }
        }

    public void printRegionsQuantity() {
        System.out.println(regionList.size());
    }

    public void printCountryArea() {
        double area = 0;
        for (Region region : regionList) {
            area += region.getArea();
        }
        System.out.println(area);
    }

    public void printRegionCentres() {
        for (Region region : regionList) {
            System.out.println(region.getRegionalCenter() + " ");
        }
    }
}


