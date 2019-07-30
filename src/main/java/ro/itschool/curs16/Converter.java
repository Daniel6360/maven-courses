package ro.itschool.curs16;

public class Converter extends Exception{

    public int toInt(String input) throws Exception{
        if(input ==null){
            throw new NullException();
        }
        for(int i=0; i<input.length(); i++){
            if (Character.isDigit(input.charAt(i))){
            }else if(!Character.isDigit(input.charAt(i))){
                throw new  NotDigitException(input.charAt(i));
            }
        }
        if(input.isEmpty()){
            throw new EmptyStringException();
        }
        return Integer.parseInt(input);


    }



}
