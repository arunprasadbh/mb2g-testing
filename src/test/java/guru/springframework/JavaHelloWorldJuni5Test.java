package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaHelloWorldJuni5Test {

    @Test
    void getHello() {
        System.out.println("Running Junit5 test! ");
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();
        assert("Hello World! ".equals(javaHelloWorld.getHello()));
    }
}