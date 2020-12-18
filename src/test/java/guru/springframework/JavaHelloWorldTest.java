package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldTest {

    @Test
    void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assert ("Hello World! ".equals(javaHelloWorld.getHello()));
    }
}