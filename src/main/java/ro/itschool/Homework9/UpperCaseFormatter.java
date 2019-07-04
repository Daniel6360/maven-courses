package ro.itschool.Homework9;

public  class UpperCaseFormatter implements TextFormatter{
    String format;
    public UpperCaseFormatter (String format){
        this.format=format;

    }
    public UpperCaseFormatter(){}

    @Override
    public String format(String s1) {
        return format=s1.toUpperCase();
    }
}
