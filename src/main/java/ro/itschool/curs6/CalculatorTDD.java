package ro.itschool.curs6;

public class CalculatorTDD {
    public int add (int termen1, int termen2){
        return termen1+termen2;
    }

    public int divide(int termen1,int termen2){
        if (termen2 == 0) {
            return 0;
        }else{
            return termen1/termen2;
        }
    }


    public int substract(int termen1,int termen2) {
        return termen1-termen2;
    }


    }
