package ro.itschool.curs16;

import ro.itschool.homework14.Country;

public class BadCountryException extends Exception{
    private Country country;

    public BadCountryException(Country country) {
        this.country=country;
    }
    public Country getCountry(){
        return country;
    }
}
