package ro.itschool.homework16;

public class LessThanOneException extends Exception{
    public LessThanOneException(){
        super("Age can't be less than one or negative");
    }
}
