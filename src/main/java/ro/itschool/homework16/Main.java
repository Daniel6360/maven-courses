package ro.itschool.homework16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BirthYearCalculator calculator = new BirthYearCalculator();

        System.out.println(calculator.calculateAge(18));

        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("Input age...");
        age = input.nextInt();
        try {
            System.out.println(calculator.calculateAge(age));
        } catch (Exception ex) {
            System.out.println("An exception was thrown. Please enter correct input");
            age = input.nextInt();
            System.out.println(calculator.calculateAge(age));
        }



        System.out.println(IntTools.digitSum(1234));
        System.out.println(IntTools.lastDigit(1238));


        IntTools test=new IntTools(1234);

        System.out.println(test.digitAt(2));

    }
}
