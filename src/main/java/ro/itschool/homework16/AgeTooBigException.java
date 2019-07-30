package ro.itschool.homework16;

public class AgeTooBigException extends Exception{
    public AgeTooBigException(){
        super("Age is too big. You can't be alive");
    }
}
