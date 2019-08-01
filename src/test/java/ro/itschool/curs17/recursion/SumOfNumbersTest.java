package ro.itschool.curs17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {
    @Test
    @DisplayName("sum(3)=6")

    void test(){
        SumOfNumbers sm=new SumOfNumbers();
        assertEquals(sm.sum(3),6);
    }

}