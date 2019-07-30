package ro.itschool.curs16;

public class NotDigitException extends Exception {
    int i;



    public NotDigitException(int  i) {
        super("Position " +i + "is not a character");
    }
}