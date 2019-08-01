package ro.itschool.curs17.recursion;

public class StringLength{
    public int length(String s){
        if(s.equals("")){
            return 0;
        }else {
            return 1+length(s.substring(1));
        }
    }
}
