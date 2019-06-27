package ro.itschool.curs7.light;

public class Main {
    public static void main(String[] args) {
        OilLamp oilLmap=new OilLamp();
        LightBulb lightBulb=new LightBulb();

        showTheLight(lightBulb);
        showTheLight(oilLmap);


    }

    private static void showTheLight(Lumineers lumineer){
        System.out.println(lumineer);
    }
}
