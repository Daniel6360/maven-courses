package ro.itschool.homework16;

public class IntToolsMain {
    public static void main(String[] args) throws Exception {
        IntTools test1=new IntTools(1234);
        System.out.println(test1.digitSum());

        IntTools test2=new IntTools(1234);
        System.out.println(test1.lastDigit());

        IntTools test3=new IntTools(1234);
        System.out.println(test1.digitAt(2));
    }
}
