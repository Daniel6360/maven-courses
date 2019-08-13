package ro.itschool.homework20;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[]array=new Integer[]{12,11,14,6};
        MyObject<Integer> srt=new MyObject<>();
        System.out.println(Arrays.toString(srt.bubbleSort(array)));

        String[] array2=new String[]{"def","abc","xyz","cal"};
        MyObject<String>srt2=new MyObject<>();
        System.out.println(Arrays.toString(srt2.bubbleSort(array2)));

    }
}
