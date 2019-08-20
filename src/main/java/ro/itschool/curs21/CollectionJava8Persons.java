package ro.itschool.curs21;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionJava8Persons {

    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("Adrian", 18),
                new Person("Doru", 16),
                new Person("Mihai", 19),
                new Person("Emil", 14),
                new Person("Alina",16)

        );

        List<String> prs = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(prs);

        List<String>prs2=persons.stream()
                .filter(person -> person.getAge()<18)
                .filter(person -> person.getName().startsWith("A"))
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(prs2);




    }
}
