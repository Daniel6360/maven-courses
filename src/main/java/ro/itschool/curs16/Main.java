package ro.itschool.curs16;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            metoda();
            System.out.println("Nu se executa");
        }catch (RuntimeException rex){
            System.out.println("prasfs");
        }finally {
            System.out.println("Se executa indiferent");
        }

        Converter cv=new Converter();
        System.out.println(cv.toInt(null));

    }


    private static void metoda(){
        throw new RuntimeException("Ceva nu r bine");
    }


}
