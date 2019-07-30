package ro.itschool.homework14;

public class CountryNotFoundException extends Exception {
    public CountryNotFoundException(){
        super("Invalid country name.");
    }
}
