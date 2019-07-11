package ro.itschool.curs10;

import ro.itschool.curs10.maps.MapMain;

import javax.print.DocFlavor;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("John", 22, "brown"),
                new Person("Barry", 21, "red"),
                new Person("Linda", 25, "brown"),
                new Person("Tony", 26, "blue"),
                new Person("Carol", 45, "brown"),
                new Person("Peter", 35, "brown"),
                new Person("Gary", 32, "red"),
                new Person("Zoe", 12, "brown")

        );


        List<String> words = new ArrayList<>();
        words.add("Ana");
        words.add("are");
        words.add("multe");
        words.add("mere");
        words.add("si");
        words.add("pere");
        words.add("Ana");
        words.add("si");
        words.add("Maria");
        words.add("si");
        words.add("Ionut");

        List<String> result = duplicateWords("mere", words);
        System.out.println(result);
        List<String> removedMere = removeWords("mere", words);
        System.out.println(removedMere);
        removeWordRef("Ana", words);
        System.out.println(words);
        uniqueElements(words);
        System.out.println(personName(persons));

        System.out.println(MapMain.getNameAndAge(persons));
        System.out.println(MapMain.groupByHair(persons));


    }

    public static List<String> duplicateWords(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            result.add(element);
            if (element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }

    public static List<String> removeWords(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {

            if (!element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }


    public static void removeWordRef(String word, List<String> words) {
        Iterator<String> wordIterator = words.iterator();
        while (wordIterator.hasNext()) {
            String next = wordIterator.next();
            if (next.equals(word)) {
                wordIterator.remove();
            }
        }
    }

    public static void uniqueElements(List<String> words) {
        Set<String> unique = new HashSet<>();


        for (String element : words) {
            unique.add(element);

        }
        System.out.println(unique);

    }

    public static List<String> personName(List<Person> persons) {
        List<String> names = new ArrayList<>();
        for (Person element : persons) {
            names.add(element.getName());
        }
        return names;

    }


}





