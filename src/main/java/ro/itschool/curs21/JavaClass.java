package ro.itschool.curs21;

import ro.itschool.Homework12.ListOperations;

import java.util.ArrayList;
import java.util.List;

public class JavaClass {

    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        System.out.println(modifyList(names, name -> name.toUpperCase()));

        System.out.println(modifyList(names,name -> name.toLowerCase()));


    }

    public static List<String> modifyList(List<String> list, ListFunction function) {
        List<String> result = new ArrayList<>();
        for (String name : list) {
            String transformedName = function.apply(name);
            result.add(transformedName);
        }
        return result;
    }

    interface ListFunction {
        public String apply(String name);
    }
}
