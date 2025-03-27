package guru.springframework.spring_6_di.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void sayHello() {

        MyController myController = new MyController();

        System.out.println(myController.sayHello());
    }
}