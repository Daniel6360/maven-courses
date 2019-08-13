package ro.itschool.homework19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort srt=new InsertionSort();

        System.out.println(Arrays.toString(srt.sort(new int[]{88,1,12,4})));

        RecursiveLinearSearch src=new RecursiveLinearSearch();
        System.out.println(src.search(new int[]{3,4,86,100,43,7,14},14));
    }
}
