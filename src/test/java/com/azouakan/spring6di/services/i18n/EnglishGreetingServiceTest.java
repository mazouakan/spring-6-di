package com.azouakan.spring6di.services.i18n;

import com.azouakan.spring6di.controllers.i18n.Myi18NController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@ActiveProfiles({"EN","DEV"})
@SpringBootTest
class EnglishGreetingServiceTest {

    @Autowired
    Myi18NController controller;
    @Test
    void sayGreeting() {
        System.out.println(controller.sayHello());
    }
}