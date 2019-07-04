package ro.itschool.curs9;

public class Main {
    public static void main(String[] args) {
        print(new Parent());
        print(new Child());
        Parent pChild = new Child();
        print(pChild);
    }
    public static void print (Parent object){
        object.doSomething();
        System.out.println(object.say());
    }


}
