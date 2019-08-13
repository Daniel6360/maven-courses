package ro.itschool.curs20.objects;

public class Naminator<T extends Nameable> {

    public T nameMe(T obj) {
        obj.setName("bla");
        return obj;
    }

}


interface Nameable{
    void setName(String name);
}
