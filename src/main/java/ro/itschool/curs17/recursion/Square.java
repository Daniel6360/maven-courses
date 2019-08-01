package ro.itschool.curs17.recursion;

public class Square {
    public  int power(int b,int p){
        if (p==0){
            return 1;
        }else {
            return b*power(b,p-1);
        }
    }
}
