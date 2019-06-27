package ro.itschool.curs8;

public class AnimalsMain {

    public static void main(String[] args) {
        Dog dog =new Dog();
        System.out.println(dog.noOfLimbs());
        System.out.println(dog.voice());
        dog.eat("jiui");
    }
}
