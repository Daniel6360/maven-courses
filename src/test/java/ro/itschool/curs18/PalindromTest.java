package ro.itschool.curs18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {
    protected Palindrom palindrom;

    @BeforeEach
    void setup(){
        palindrom =new Palindrom1Index();

    }

    @Test
    @DisplayName("mama is not palindrom")

    void notPalindrome(){
        assertFalse(palindrom.check("mama"));
    }

    @Test
    @DisplayName("Ana is palindrom")

    void correctPalindrome(){
        assertTrue(palindrom.check("ana"));
    }

    @Test
    @DisplayName("single is not palindrom")

    void singleLetter(){
        assertTrue(palindrom.check("a"));
    }

    @Test
    @DisplayName("empty is not palindrom")

    void emptyString(){
        assertTrue(palindrom.check(""));
    }

    @Test
    @DisplayName("null is not palindrom")

    void nullPalindrome(){
        assertFalse(palindrom.check(null));
    }

}