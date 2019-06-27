package ro.itschool.curs8;

public class Bird extends Pet {
    @Override
    public String voice() {
        return "Cip ci rip";
    }

    @Override
    public int noOfLimbs() {
        return 2;
    }
}
