package ro.itschool.curs19.sorting;

public class BubbleSort implements SortingAlgo {

    @Override
    public int[] sort(int[] elems) {
        int n = 0;
        boolean sorted = false;

        if (elems==null){
            return null;
        }
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < elems.length-1; i++) {

                if (elems[i] > elems[i + 1]) {
                    n = elems[i];
                    elems[i] = elems[i + 1];
                    elems[i + 1] = n;
                    sorted = false;
                }
            }
        }
        return elems;
    }
}


