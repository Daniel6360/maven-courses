package ro.itschool.curs17.recursion;

public class FactorialMain {
    public static void main(String[] args) {
        Factorial fa =new Factorial();
        System.out.println(fa.factorial(10));

        Square sq=new Square();
        System.out.println(sq.power(2,2));

        SumOfNumbers sm=new SumOfNumbers();
        System.out.println(sm.sum(2));

        Fibonacci fb=new Fibonacci();
        System.out.println(fb.fib(10));

        StringLength st= new StringLength();
        System.out.println(st.length("abc"));
    }
}
