package ro.itschool.mvnbase;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class HelloMavenTest {
    @Test
    @DisplayName("When we call say hello THEN an ascii art is returned")
    void sayHelloShouldReturnAscii() throws IOException {
        HelloMaven helloMaven=new HelloMaven();

        String result = helloMaven.sayHello();

        Assertions.assertTrue(result.contains("|"));
    }

}