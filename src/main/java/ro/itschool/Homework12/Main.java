package ro.itschool.Homework12;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> first=new ArrayList<>();
        first.add("hellow");
        first.add("from");
        first.add("here");

        List<String> second=new ArrayList<>();
        second.add("hello");
        second.add("how");
        second.add("there");
        ListOperations operate =new ListOperations();

        System.out.println(operate.compare(first,second));
    }
}
