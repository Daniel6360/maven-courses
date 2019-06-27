package ro.itschool.curs7.light;

public class OilLamp implements Lumineers {

    boolean fire;

    @Override
    public void On() {
        this.fire=true;
    }

    @Override
    public void Off() {
        this.fire=false;
    }

    @Override
    public boolean isLit() {
        return fire;
    }

    public void addOil(int liters){

    }
}
