package ro.itschool.homework14;

import java.util.*;
import java.util.concurrent.Callable;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public List<Country> getCountryStartingWithLetter(String letter) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            letter = letter.toUpperCase();
            if (country.getName().startsWith(letter)) {
                result.add(country);
            }

        }
        return result;
    }

    public String getCountryCapital(String countryName) throws Exception {
        String result = null;
        for (Country country : countries) {
            if (!countryName.equals(country.getName())) {
                throw new CountryNotFoundException();
            } else if (country.getName().equals(countryName)) {
                result = country.getCapital();
            }
        }
        return result;
    }

    public long getPopulation(String countryName) throws Exception {
        long result = 0;
        for (Country country : countries) {
            if (!countryName.equals(country.getName())) {
                throw new CountryNotFoundException();
            } else if (country.getName().equals(countryName)) {
                result = country.getPopulation();
            }
        }
        return result;
    }

    public long getArea(String countryName) throws Exception {
        int result = 0;
        for (Country country : countries) {
            if (!countryName.equals(country.getName())) {
                throw new CountryNotFoundException();
            } else if (country.getName().equals(countryName)) {
                result = country.getArea();
            }
        }
        return result;
    }

    public Country getLargestCountry() {

        Country max = null;
        for (Country country : countries) {
            if (max == null || country.getArea() > max.getArea()) {
                max = country;
            }
        }

        return max;
    }
}
