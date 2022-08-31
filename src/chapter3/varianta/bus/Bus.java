package chapter3.varianta.bus;

public class Bus {
    private String surnameAndInitials;
    private String busNumber;
    private String routeNumber;
    private String brand;
    private int startingYear;
    private int mileage;

    public Bus(String surnameAndInitials, String busNumber, String routeNumber, String brand, int startingYear, int mileage) {
        setSurnameAndInitials(surnameAndInitials);
        setBusNumber(busNumber);
        setRouteNumber(routeNumber);
        setBrand(brand);
        setStartingYear(startingYear);
        setMileage(mileage);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "surnameAndInitials='" + surnameAndInitials + '\'' +
                ", busNumber='" + busNumber + '\'' +
                ", routeNumber='" + routeNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", startingYear=" + startingYear +
                ", mileage=" + mileage +
                '}';
    }

    public String getSurnameAndInitials() {
        return surnameAndInitials;
    }

    public void setSurnameAndInitials(String surnameAndInitials) {
        this.surnameAndInitials = surnameAndInitials;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
