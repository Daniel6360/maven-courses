package ro.itschool.curs17.enumerations;

public class TimeMain {
    public static void main(String[] args) {
        System.out.println(Time.HOUR.toMinute(1));
        System.out.println(Time.MINUTES.toSeconds(60));
    }
}
