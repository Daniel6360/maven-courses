package ro.itschool.homework19;

import ro.itschool.curs19.searching.SearchAlgo;
import ro.itschool.curs19.sorting.SortingAlgo;

import java.util.Arrays;

public class RecursiveLinearSearch implements SearchAlgo {
    @Override
    public boolean search(int[] elems, int elem) {
        if (elems == null) {
            return false;
        }

        if(elems.length==0){
            return false;
        }

        if(elems[0]==elem){
            return true;
        }
        else{
            return search(Arrays.copyOfRange(elems,1,elems.length),elem);
        }


    }
}
