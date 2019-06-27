package ro.itschool.homework7;


public class Bottle {
    int capacity;
    int availableLiquid;
    boolean open;

    public boolean checkCapp(){
     if (availableLiquid>capacity){
         return true;

     }   else {
         return false;
     }
    }

    public int readAvaibleLiquid(){
        return availableLiquid;
    }

    public int readAvaibleCapp(){
        return capacity-availableLiquid;
    }

    public void openBottle(){

        if (open==true) {
            System.out.println("Bottle is already open");
        }else{
            open=true;
        System.out.println("Bottle is opened" + open);
        }
    }

    public void closeBottle(){

        if (open==false){
            System.out.println("Bottle is already closed");
        }else{
        open=false;
        System.out.println("Bottle is closed"+ open);
        }
    }

    public void drink(int liters){

        if(liters>=availableLiquid){

            System.out.println("Cant't drink " + liters +" liters");
        }
        else if (open==false){

            System.out.println(liters+"You can't drink. Bottle is close");

        }else if(open==true){
            System.out.println(liters+" liters have been drunk");
        }
    }






}
