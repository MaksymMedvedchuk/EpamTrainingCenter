package chapter4.task4;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String districtName;
    private double area;
    private String regionCity;
    List<City> cityList = new ArrayList<>();

    public void addCity(City city){
        cityList.add(city);
    }
}
