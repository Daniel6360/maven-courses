package ro.itschool.curs16;

import ro.itschool.homework14.Country;
import ro.itschool.homework14.CountryReader;

public class CountryEvaluatorMain {
    public static void main(String[] args) {
        CountryEvaluator countryEvaluator=new CountryEvaluator();

        try {
            System.out.println(countryEvaluator.evaluate(new Country("Germany")));
            System.out.println(countryEvaluator.evaluate(new Country("Romania")));
        }catch (BadCountryException bce){
            System.out.println("The country that is bad is " + bce.getCountry());
        }
    }

}
