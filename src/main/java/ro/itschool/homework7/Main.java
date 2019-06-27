package ro.itschool.homework7;

public class Main {
    public static void main(String[] args) {
        Bottle bottle=new Bottle();

        bottle.capacity=5;
        bottle.availableLiquid=3;
        bottle.open=false;

        System.out.println(bottle.checkCapp());

        System.out.println(bottle.readAvaibleLiquid());

        System.out.println(bottle.readAvaibleCapp());

        bottle.openBottle();
        bottle.closeBottle();
        bottle.openBottle();


        bottle.drink(3);

    }
}
