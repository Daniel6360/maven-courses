package ro.itschool.curs17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    @DisplayName("2^3=8")
    void test() {
        Square square = new Square();
        assertEquals(square.power(2, 3), 8);
    }

    @Test
    @DisplayName("0^0=1")
    void test2(){
        Square square=new Square();
        assertEquals(square.power(0,0),1);
    }
}