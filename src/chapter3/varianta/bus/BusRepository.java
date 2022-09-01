package chapter3.varianta.bus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BusRepository {

    private final List<Bus> busList = new ArrayList<>();

    public void addDBuses(Bus bus) {
        busList.add(bus);
    }

    public List<Bus> findByRouteNumber(String inputBus) {
        List<Bus> list = new ArrayList<>();
        Iterator<Bus> iterator = busList.iterator();  //Iterator працює з Bus, iterator перебирає нашу колекцію
        while (iterator.hasNext()) { //якщо є послідуючий елемент
            Bus bus = iterator.next();//bus присвоюємо цей елемент
            if (bus.getRouteNumber().equals(inputBus)) {
                list.add(bus);
            }
        }
        return list;
    }

    public List<Bus> findByExploitationMoreGivenPeriod(int inputExploitationYears) {
        List<Bus> list = new ArrayList<>();
        Iterator<Bus> iterator = busList.iterator();
        while (iterator.hasNext()) {
            Bus bus = iterator.next();
            if (LocalDate.now().getYear() - bus.getStartingYear() >= inputExploitationYears) {
                list.add(bus);
            }
        }
        return list;
    }

    public List<Bus> findByMileageGreaterGivenDistance(int inputGiveDistance) {
        List<Bus> list = new ArrayList<>();
        Iterator<Bus> iterator = busList.iterator();
        while (iterator.hasNext()) {
            Bus bus = iterator.next();
            if (bus.getMileage() >= inputGiveDistance) {
                list.add(bus);
            }
        }
        return list;
    }
}


