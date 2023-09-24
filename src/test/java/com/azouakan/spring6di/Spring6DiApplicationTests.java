package com.azouakan.spring6di;

import com.azouakan.spring6di.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	MyController myController;

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void testAutowireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

	@Test
	void testGetControllerFromCtx(){
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

}
