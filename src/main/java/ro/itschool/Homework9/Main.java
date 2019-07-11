package ro.itschool.Homework9;

public class Main {
    public static void main(String[] args) {
        ChangeTextFormatter obj = new ChangeTextFormatter("Hello");
        String s1=obj.format("qwe");
        System.out.println(s1);

        UpperCaseFormatter obj2=new UpperCaseFormatter("hello");
        String s2=obj2.format(obj2.format);
        System.out.println(s2);

        NSATextFormatter obj3=new NSATextFormatter("NSAtext");
        String s3=obj3.format(obj3.format);
        System.out.println(s3);

        UpperCaseSuffixFormatter obj4=new UpperCaseSuffixFormatter("hello");
        String s4=obj4.format(obj4.format,"w");
        System.out.println(s4);
        System.out.println(obj4.format);


    }
}
