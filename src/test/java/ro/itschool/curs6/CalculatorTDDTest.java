package ro.itschool.curs6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTDDTest {
    @Test
    @DisplayName("When adding two zeros Then zero is returned")
    void addingZeroReturnsZero(){
        //SETUP
         CalculatorTDD calculator = new CalculatorTDD();

         //RUN
        int result=calculator.add(0,0);

        //ASSERT
        assertTrue(result==0);
    }

    @Test
    @DisplayName("WHEN adding two positive numbers Then their sum is returned")
   void addingTwoPossitiveReturnsSum() {
        CalculatorTDD calculator = new CalculatorTDD();

        int result = calculator.add(4, 5);

        assertEquals(9,result);
    }

    @Test
    @DisplayName("WHEN dividing a number Then the result is returned")
    void dividingTwoPositiveNumbers(){
        CalculatorTDD calculator=new CalculatorTDD();

        int result=calculator.divide(10,2);

        assertEquals(5,result);
    }

    @Test
    @DisplayName("WHEN two positive numbers are substracted result is returned")
    void substractingTwoPositiveNumber(){
        CalculatorTDD calculator =new CalculatorTDD();



        int result=calculator.substract(10,4);

        assertEquals(6,result);
    }

    @Test
    @DisplayName("WHEN dividing by 0 THEN returns 0")
    void divisionByZero(){
        CalculatorTDD calculator =new CalculatorTDD();

        int result = calculator.divide(5,0);

        assertEquals(0,result);
    }



}