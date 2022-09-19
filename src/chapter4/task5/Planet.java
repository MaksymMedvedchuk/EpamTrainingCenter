package chapter4.task5;

import java.util.ArrayList;
import java.util.List;

public class Planet {  //чому планета містить тільки материки і океани, планета теж може містити острова? Чи типу так як є клас Океани, які можуть містити острова
    List<Mainland> mainlandList = new ArrayList<>();
    List<Ocean> oceanList = new ArrayList<>();
    private String name;

    public void addMainLand(Mainland mainland) {
        mainlandList.add(mainland);
    }

    public void printMainlandName() {
        for (Mainland mainland : mainlandList) {
            System.out.println(mainland);
        }
    }
//плутаюсь де створювати методи
    public void printMainlandQuantity(){
        System.out.println(mainlandList.size());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//чому тут не можна одрвзу назначити імя?
    }

    public List<Mainland> getMainlandList() {
        return mainlandList;
    }

    public void setMainlandList(List<Mainland> mainlandList) {
        this.mainlandList = mainlandList;
    }

    public List<Ocean> getOceanList() {
        return oceanList;
    }

    public void setOceanList(List<Ocean> oceanList) {
        this.oceanList = oceanList;
    }


}
