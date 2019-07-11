package ro.itschool.curs11;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private List<Person> list;

    public PersonService(List<Person> list) {
        this.list = list;
    }

    public List<Person> getAll() {
        return list;

    }

    public Person getById(int id) {
        for (Person person : list) {
            if (person.getId() == id) {
                return person;
            }


        }
        return null;


    }

    public Person getByName(String name) {
        for (Person person : list) {
            if (person.getName().equals(name)) {
                return person;
            }

        }
        return null;
    }

    public List<Person> getByOccupation(String occupation) {
        List<Person> result = new ArrayList<>();
        for (Person person : list) {
            if (person.getOcupation().equals(occupation)) {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findBySallary(int sallary) {
        List<Person> result = new ArrayList<>();
        for (Person person : list) {
            if (person.getSallary() == sallary) {
                result.add(person);
            }

        }
        return result;
    }

    public Person findOldestPerson() {
        Person oldest =null;
        for (Person person : list) {
            if (oldest==null || person.getAge() > oldest.getAge()) {
                oldest=person;
            }
        }
        return oldest;
    }

    
}


