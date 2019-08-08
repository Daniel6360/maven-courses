package ro.itschool.curs19.searching;

public class LinearSearch implements SearchAlgo {
    @Override
    public boolean search(int[] elems, int elem) {

        if(elems==null){
            return false;
        }
        boolean found;
        do {

        for(int i=0;i<elems.length;i++) {
            if (elems[i] == elem) {
                found=true;
                return true;

            }else found=false;
        }
        }while (found=false);
        return found;
    }
}
