package chapter4.varianta.task4;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String districtName;
    List<City> cityList = new ArrayList<>();

    public District(String districtName) {
        this.districtName = districtName;
    }

    public void addCity(City city){
        cityList.add(city);
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return districtName;
    }
}
