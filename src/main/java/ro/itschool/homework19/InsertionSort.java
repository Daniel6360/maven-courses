package ro.itschool.homework19;

import ro.itschool.curs19.sorting.SortingAlgo;

public class InsertionSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        int rev=0;
        boolean sorted;
        if (elems==null){
            return null;
        }

        do {
            sorted=true;
            for (int i = 1; i < elems.length; i++) {
                if (elems[i] < elems[i - 1]) {
                    rev = elems[i];
                    elems[i] = elems[i - 1];
                    elems[i - 1] = rev;
                    sorted=false;
                }

            }
        }while (!sorted);
        return elems;

    }
}
