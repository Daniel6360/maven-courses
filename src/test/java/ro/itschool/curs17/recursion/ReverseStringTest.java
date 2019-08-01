package ro.itschool.curs17.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
@Test
@DisplayName("abc=cba")
    void test(){
    ReverseString rv=new ReverseString();

    assertEquals(rv.rev("abc"),"cba");
    System.out.println(new ReverseString().rev("abc"));
}
}