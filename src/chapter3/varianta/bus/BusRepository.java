package chapter3.varianta.bus;

import java.util.ArrayList;
import java.util.List;

public class BusRepository {

    private final List<Bus> busList = new ArrayList<>();

    public void addDBuses(Bus bus){
        busList.add(bus);
    }

}
