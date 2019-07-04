package ro.itschool.Homework9;

public class UpperCaseSuffixFormatter extends UpperCaseFormatter{
    String format;

    public UpperCaseSuffixFormatter(String format){
        this.format=format;
    }

    public String format(String s1 , String s2) {
        return format=s1.toUpperCase()+s2.toUpperCase() ;
    }
}
