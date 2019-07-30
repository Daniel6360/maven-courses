package ro.itschool.curs16;

public class EmptyStringException extends Exception {
    public EmptyStringException(){
        super("String is empty. Need input");
    }
}
