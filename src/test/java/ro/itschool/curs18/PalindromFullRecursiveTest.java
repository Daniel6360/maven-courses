package ro.itschool.curs18;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PalindromFullRecursiveTest extends PalindromTest {
    @Override
    @BeforeEach
    void setup() {
        palindrom=new PalindromFullRecursive();
    }

}