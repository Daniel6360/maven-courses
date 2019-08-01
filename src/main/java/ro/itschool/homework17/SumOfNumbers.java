package ro.itschool.homework17;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum(1234));
    }
    public static int sum(int n){
        if (n==0){
            return 0;
        }else{
            return n%10+sum(n/10);
        }

    }
}


