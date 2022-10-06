package chapter4.varianta.task4;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String regionName;
    private double area;
    List<District> districtList = new ArrayList<>();

    public Region(String regionName, double area) {
        this.regionName = regionName;
        this.area = area;
    }

    public Region() {
    }

    public void addDistrict(District district){
        districtList.add(district);
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public String toString() {
        return regionName;
    }
}
