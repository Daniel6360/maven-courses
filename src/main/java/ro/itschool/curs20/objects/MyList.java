package ro.itschool.curs20.objects;

import java.security.PublicKey;
import java.util.Arrays;

public class MyList<T> {

    private T[] array;
    private int size;

    public MyList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public T get(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[index];
        }
    }

    public  void add(T elem) {
        ensureCapacity();
        array[size] = elem;
        size++;
    }

    private void ensureCapacity() {
        if(array.length>=size){
            T[]copy=array;
            array=(T[]) new Object[array.length+10];

            for (int i=0;i<copy.length;i++){
                array[i]=copy[i];
            }


        }

    }


    @Override
    public String toString() {
        return "MyList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }

    public int size() {
        return size;
    }


}
