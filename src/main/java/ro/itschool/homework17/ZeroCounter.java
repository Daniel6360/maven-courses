package ro.itschool.homework17;

public class ZeroCounter {
    public static void main(String[] args) {
        System.out.println(countZero(130303));
    }

    public static int countZero(int number) {
        int counter = 0;
        if (number==0) {
            counter=0;


        }else {

            if(number%10==0) {
                counter++;
                countZero(number/10);
            }

        }
        return counter;
    }
}