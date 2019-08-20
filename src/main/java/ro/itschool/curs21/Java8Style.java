package ro.itschool.curs21;

import java.util.ArrayList;
import java.util.List;

public class Java8Style {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        System.out.println(findNames(names, new AnotherListPredicate() {
            @Override
            public boolean apply(String value) {
                return value.equals("Alex");
            }
        }));

        System.out.println(findNames(names,value -> value.equals("Alex")));
        System.out.println(findNames(names,value -> value.endsWith("x")));
        System.out.println(findNames(names,value -> value.endsWith("s")));
    }

    private static List<String> findNames(List<String> names, AnotherListPredicate predicate) {
        List<String> result = new ArrayList<>();

        for (String name : names) {
            if (predicate.apply(name)) {
                result.add(name);

            }
        }
        return result;
    }



    interface AnotherListPredicate {
        boolean apply(String value);
    }
}
