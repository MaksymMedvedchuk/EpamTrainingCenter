package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TestR {

    List<Test> stringList = new ArrayList<>();

    public void addString(Test string){
        stringList.add(string);

    }

    @Override
    public String toString() {
        return stringList.stream().map(Objects::toString).collect(Collectors.joining(" "));
    }
}
