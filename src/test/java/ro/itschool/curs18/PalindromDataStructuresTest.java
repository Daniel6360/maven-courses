package ro.itschool.curs18;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PalindromDataStructuresTest extends PalindromTest{
    @Override
    @BeforeEach
    void setup() {
        palindrom=new PalindromDataStructures();
    }

}