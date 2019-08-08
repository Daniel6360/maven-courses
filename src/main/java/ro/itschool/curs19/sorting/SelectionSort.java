package ro.itschool.curs19.sorting;

public class SelectionSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }
        for (int i = 0; i < elems.length; i++) {
            int minPos = minPosFind(elems, i);
            swap(elems, i, minPos);
        }
        return elems;
    }

    public int minPosFind(int[] elems, int pos) {
        int minPos = pos;
        for (int i = pos; i < elems.length; i++) {
            if (elems[i] < elems[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
}
