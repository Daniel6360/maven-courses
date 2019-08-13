package ro.itschool.curs20.objects;

public class Object1 implements Nameable {

    private String name;

    public String getName() {
        return name;
    }



    @Override
    public void setName(String name) {
        this.name=name;
    }
}
