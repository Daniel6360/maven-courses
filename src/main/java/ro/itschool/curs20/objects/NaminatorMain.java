package ro.itschool.curs20.objects;

public class NaminatorMain {
    public static void main(String[] args) {
        Naminator<Object1> name=new Naminator<>();
        Object1 obj = new Object1();
        name.nameMe(obj);
        System.out.println(obj.getName());

        Naminator<Object2> naminator = new Naminator<>();
        Object2 object2 = new Object2();
        naminator.nameMe(object2);
        System.out.println(object2.getName());
    }
}
