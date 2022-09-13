package chapter3.varianta.bus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class BusRepository {

    private final List<Bus> busList = new ArrayList<>();

    public void addDBuses(Bus bus) {
        busList.add(bus);
    }

    public List<Bus> findByRouteNumber(String roudNumber) {
        List<Bus> list = new ArrayList<>();
        Iterator<Bus> iterator = busList.iterator();  //Iterator працює з Bus, iterator перебирає нашу колекцію
        while (iterator.hasNext()) { //якщо є послідуючий елемент
            Bus bus = iterator.next();//bus присвоюємо цей елемент
            if (bus.getRouteNumber().equals(roudNumber)) {
                list.add(bus);
            }
        }
        return list;
    }
//equals Порівнює цей рядок із вказаним об’єктом. Результат є істинним тоді і тільки тоді, коли аргумент не є нульовим
// і є об’єктом String, який представляє ту саму послідовність символів, що й цей об’єкт.
    public List<Bus> findByExploitationMoreGivenPeriod(int exploitationYears) {
        List<Bus> list = new ArrayList<>();
        Iterator<Bus> iterator = busList.iterator();
        while (iterator.hasNext()) {
            Bus bus = iterator.next();
            if (LocalDate.now().getYear() - bus.getStartingYear() >= exploitationYears) {
                list.add(bus);
            }
        }
        return list;
    }

    public List<Bus> findByMileageGreaterThan(int mileage) {
        List<Bus> list = new ArrayList<>();
        Iterator<Bus> iterator = busList.iterator();
        while (iterator.hasNext()) {
            Bus bus = iterator.next();
            if (bus.getMileage() >= mileage) {
                list.add(bus);
            }
        }
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BusRepository)) return false;
        BusRepository that = (BusRepository) o;
        return Objects.equals(busList, that.busList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(busList);
    }
}


