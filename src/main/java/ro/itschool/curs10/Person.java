package ro.itschool.curs10;

public class Person {
    private final String name;
    private final int age;
    private final String hairColor;

    Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }


}
