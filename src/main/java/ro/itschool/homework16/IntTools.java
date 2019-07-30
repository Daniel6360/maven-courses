package ro.itschool.homework16;

public class IntTools {
    int a;

    public IntTools(int a) {
        this.a = a;
    }

    public  int digitSum() throws Exception {
        String[] conv = Integer.toString(this.a).split("");
        int result = 0;
        for (int i = 0; i < conv.length; i++) {
            result = result + Integer.parseInt(conv[i]);

        }
        return result;
    }

    public  int lastDigit() throws Exception {
        String[] conv = Integer.toString(this.a).split("");
        int result = 0;
        for (int i = 0; i < conv.length; i++) {
            result = Integer.parseInt(conv[i]);

        }
        return result;
    }

    public int digitAt(int pos) throws Exception {
        String[] conv = Integer.toString(this.a).split("");

        if(pos>conv.length||pos<0){
            throw new InvalidPositonException();
        }

        int result = 0;
        for (int i = 0; i <= pos; i++) {
                result = Integer.parseInt(conv[i]);
        }
        return result;
    }


}
