package ro.itschool.homework14;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        CountryReader test=new CountryReader();
       // System.out.println(test.readCountry("src/Main/resources/countries.txt"));


        CountryStatistics test1=new CountryStatistics(test.readCountry("src/Main/resources/countries.txt"));
       // System.out.println(test1.getAllCountries());

       // System.out.println(test1.getCountryStartingWithLetter("k"));

        System.out.println(test1.getCountryCapital("Romania"));
        System.out.println(test1.getPopulation("Romania"));
        System.out.println(test1.getArea("Romania"));
        System.out.println(test1.getLargestCountry());







    }
}
