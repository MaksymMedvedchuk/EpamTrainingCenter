package chapter4.task4;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String regionName;
    private double area;
    private String regionalCenter;
    List<District> districtList = new ArrayList<>();

    public Region(String regionName, double area, String regionalCenter) {
        this.regionName = regionName;
        this.area = area;
        this.regionalCenter = regionalCenter;
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

    public String getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(String regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public String toString() {
        return regionalCenter;
    }
}
