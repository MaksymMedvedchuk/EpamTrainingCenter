package chapter4.varianta.task5;

import java.util.ArrayList;
import java.util.List;

public class Ocean {
    private String name;
    List<Island> islandList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Island> getIslandList() {
        return islandList;
    }

    public void setIslandList(List<Island> islandList) {
        this.islandList = islandList;
    }
}
