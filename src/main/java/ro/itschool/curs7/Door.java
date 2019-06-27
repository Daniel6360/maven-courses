package ro.itschool.curs7;

public class Door implements AccesProvider {
    public  boolean open;
    private boolean locked;

    Door(){
        open=true;
    }
    Door (boolean open){
        this.open=open;
    }

    Door(boolean open, boolean locked){
        this.open=open;
        this.locked=locked;
    }

    public void open (int distance){
        locked=false;
        open=true;
    }

    @Override
    public void close(){
        locked=false;
        open=false;
    }

    @Override
    public void lock(){
        locked=true;
    }


    void openDoor(){
        locked=false;
        open=true;

    }

    void closeDoor(){
        locked=false;
        open=false;
    }

    void lockDoor(){
        locked=true;

    }

    void unlockDoor(){
        locked=false;

    }

    boolean isLocked(){
        return locked;
    }
    boolean isOpen(){
        return open;
    }

    void doorLabels(String... labels){
        for (String label : labels){

        }
    }

    public String toString(){
        return "Door is opened" + open +"and is locked?" + locked;
    }
}
