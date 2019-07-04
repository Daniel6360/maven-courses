package ro.itschool.Homework9;

public class ChangeTextFormatter implements TextFormatter {
    String format;
    public ChangeTextFormatter(String format){
        this.format=format;
    }
    @Override
    public String format(String replace ) {
        return format.replace(format,replace);
    }
}
