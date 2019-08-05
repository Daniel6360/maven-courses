package ro.itschool.homework17;

public class ZeroCounter {
    public static void main(String[] args) {
        System.out.println(countZero(1303030));
    }

    public static int countZero(int number) {
        int counter = 0;
        if (number == 0) {
            return counter + countZero(number / 10);


        } else {

            return 0;
        }
    }
}