package ro.itschool.curs18;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Palindrom2IndexTest extends PalindromTest{
    @Override
    @BeforeEach
    void setup() {
        palindrom=new Palindrom2Index();
    }
}