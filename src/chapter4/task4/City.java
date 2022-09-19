package chapter4.task4;

public class City {
    private String cityName;
    private boolean isCapital;
    private boolean isRegionCentre;

    public City(String cityName) { //конструктор для просто міста
        this.cityName = cityName;
    }

    public City(String cityName, boolean isRegionCentre) {
        this.cityName = cityName;
        this.isRegionCentre = isRegionCentre;
    }

    public City(String cityName, boolean isRegionCentre, boolean isCapital) {
        this.cityName = cityName;
        this.isCapital = isCapital;
        this.isRegionCentre = isRegionCentre;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return cityName;
    }

    public boolean isCapital() {
        return isCapital;
    }

    public void setCapital(boolean capital) {
        isCapital = capital;
    }

    public boolean isRegionCentre() {
        return isRegionCentre;
    }

    public void setRegionCentre(boolean regionCentre) {
        isRegionCentre = regionCentre;
    }
}


