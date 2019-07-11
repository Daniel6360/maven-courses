package ro.itschool.curs11;

import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
         List<Person> personList=List.of(
                new Person(1,"John", 33, "Singer", 9000),
                new Person(2,"Mike", 35, "Builder", 5000),
                new Person(3,"Frank", 33, "Developer", 6000),
                new Person(4,"Lilly", 45, "Singer", 10000),
                new Person(5,"Jordan", 23, "Swimmer", 5000),
                new Person(6,"Clark", 18, "Taxi Driver", 3000),
                new Person(7,"Allen", 25,"Singer", 4000));
         PersonService get=new PersonService(personList);
        System.out.println(get.getAll());
        System.out.println(get.getById(3));
        System.out.println(get.getByName("Mike"));
        System.out.println(get.getByOccupation("Singer"));
        System.out.println(get.findOldestPerson());




    }




}
