package ro.itschool.curs7.light;

public class LightBulb implements Lumineers {
    boolean electricty;

    @Override
    public void On() {
        this.electricty=true;
    }

    @Override
    public void Off() {
        this.electricty=false;
    }

    @Override
    public boolean isLit() {
        return electricty;
    }
}
