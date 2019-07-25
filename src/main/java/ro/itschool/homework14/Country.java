package ro.itschool.homework14;

import java.util.Objects;

public class Country {
    String name;
    String capital;
    long population;
    int area;

    public Country(String name, String capital, long population, int area) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return population == country.population &&
                area == country.area &&
                Objects.equals(name, country.name) &&
                Objects.equals(capital, country.capital);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capital, population, area);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population=" + population +
                ", area=" + area +
                '}';
    }
}
