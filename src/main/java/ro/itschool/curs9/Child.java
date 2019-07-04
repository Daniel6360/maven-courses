package ro.itschool.curs9;

public class Child extends Parent{


    public Child(int age){
        super(11);
    }

    public Child() {
        this(12);
    }
    @Override
    protected String say(){
        return "Child say something";
    }
    protected String say(String message, String voice){
        return "Child says" + message + "with voice" +voice;
    }

    @Override
    protected void doSomething() {
        super.doSomething();
    System.out.println("Child do something");
    }

    @Override
    public String toString() {
        return "Child with age" + getAge();
    }

    @Override
    public boolean equals(Object anotherParent) {
        System.out.println("Comparing " + this + "with " + anotherParent);
        if (this.getClass().equals(anotherParent.getClass())) {
            return true;
        }
        return false;
    }

}
