package ro.itschool.homework20;

public class MyObject<T extends Comparable<T>> {
    public T[] bubbleSort(T[] array){
        if(array==null){
            return null;
        }

        boolean sorted;

        do{
            sorted=true;
            for (int i = 0; i < array.length-1; i++){
                if(array[i].compareTo(array[i+1])>0){
                    swap(array,i,i+1);
                    sorted=false;
                }
            }
        }while (!sorted);
return array;
    }

    public void swap(T[] array,int a,int b){
        T aux=array[a];
        array[a]=array[b];
        array[b]=aux;
    }
}
