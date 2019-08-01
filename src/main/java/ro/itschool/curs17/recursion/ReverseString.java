package ro.itschool.curs17.recursion;

public class ReverseString {
    public String rev(String s){
        if (s.equals("")){
            return "";
        }else {
            return rev(s.substring(1))+s.charAt(0);
        }
    }
}
