package ro.itschool.curs10.maps;

import ro.itschool.curs10.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> mapString = new HashMap<>();
        mapString.put("host", "localhost");
        mapString.put("password", "testuser");
        mapString.put("password", "pass123");
        System.out.println(mapString);


        for (String key : mapString.keySet()) {
            System.out.println(mapString.get(key));
        }

        for (String value : mapString.values()) {
            System.out.println(value);
        }

        Map<String, List<String>> mapList = new HashMap<>();
        mapList.put("str. Vasile Alexandri", List.of("Ionut", "Georgel", "Dinel"));
        mapList.put("str. Mihai Eminescu", List.of("Maria", "Ana", "Adrian"));

        System.out.println(mapList);
        System.out.println(mapList.get("str. Vasile Alexandri"));

    }

    public static Map<String, String> getNameAndAge(List<Person> persons) {
        Map<String, String> result = new HashMap<>();
        for (Person element : persons) {
            result.put(element.getName(), element.getHairColor());
        }
        return result;
    }

    public static Map<String, List<String>> groupByHair(List<Person> person) {
        Map<String, List<String>> result = new HashMap<>();

        for (Person element : person) {
            List<String> names=new ArrayList<>();
            names.add(element.getName());
            result.put(element.getHairColor(), names);
        }
        return result;
    }

}



