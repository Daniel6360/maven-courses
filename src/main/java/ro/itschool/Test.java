package ro.itschool;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new int[]{getDiagonalSum(new int[][]{{3, 62, 12, 0}, {3, 10, 3, 47}, {91, 2, 87, 4}, {23, 1, 0, 55}})}));

    }
        public static int getDiagonalSum(int[][] matrix){
        int a=matrix.length;
        int b=matrix[0].length;
        int sum=0;

        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                if (i==j){
                    sum=sum+matrix[i][j];
                }
            }
        }
        return sum;

    }





}
