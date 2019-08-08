package ro.itschool.curs19.sorting;

public class BubleSort2 implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        boolean sorted;
        do {
            sorted=true;
            for (int i=0; i<elems.length-1;i++){
                if (elems[i] > elems[i+1]) {
                    swap(elems,i,i+1);
                    sorted=false;
                }
            }
        }while (!sorted);
        return elems;
    }

    public void swap(int[]elems,int first,int second){
        int aux=elems[first];
        elems[first]=elems[second];
        elems[second]=aux;
    }
}
