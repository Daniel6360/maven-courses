package ro.itschool.Homework9;

public class NSATextFormatter implements TextFormatter{
    String format;
    public NSATextFormatter(String format){
        this.format=format;
    }

    @Override
    public String format(String s1) {
        return format=s1.replace("NSA","***");
    }
}
