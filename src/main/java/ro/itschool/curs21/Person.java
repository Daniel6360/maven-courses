package ro.itschool.curs21;

public class Person {


    private final String name;
    private final int age;

    public Person(String name) {
        this(name,0);
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
