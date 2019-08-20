package ro.itschool.curs21;

import java.util.ArrayList;
import java.util.List;

public class Prejava8 {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        System.out.println(findName(names,new EqualPredicate("Adrian")));
        System.out.println(findName(names,new StartsWithPredicate("A")));
        System.out.println();
    }

    private static List<String> findName(List<String> names, ListPredicate predicate) {
        List<String> result = new ArrayList<>();
        for(String name:names){
            if(predicate.applyCondition(name)){
                result.add(name);
            }
        }
        return result;
    }

    private static class StartsWithPredicate implements ListPredicate{
        private final String prefix;

        private StartsWithPredicate(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public boolean applyCondition(String name) {
            return name.startsWith(prefix);
        }
    }

    private interface ListPredicate {

        boolean applyCondition(String name);
    }

    private static class EqualPredicate implements ListPredicate {
        private final String name;

        public EqualPredicate(String name) {
            this.name = name;
        }

        @Override
        public boolean applyCondition(String str) {
            return name.equals(str);
        }
    }
}
