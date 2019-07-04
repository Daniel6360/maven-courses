package ro.itschool.curs9;

import java.beans.ParameterDescriptor;

public class Parent {

    static final String CONSTANT="This is it" ;
    private int age;
    public Parent(int age){
        this.age=age;
    }

    public Parent(){
        this(11);
    }

    protected String say(){
        return "Parrent says something";
    }


    protected void doSomething(){
        System.out.println("Parrent do something");
    }


    public int hashCode() {
        return age%3;

    }

    @Override
    public String toString() {
        return "Parent with age "+age;
    }

    int getAge(){
        return age;
    }
    public boolean equals(Object anotherParent){
        System.out.println("Comparing " + this + "with " + anotherParent);
        if (Parent.class.equals(anotherParent.getClass())) {
            return true;
        }
        return false;
    }
}
