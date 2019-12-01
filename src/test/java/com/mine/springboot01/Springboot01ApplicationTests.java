package com.mine.springboot01;

import com.mine.springboot01.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/**
 *这是sb的单元测试
 * 可以在测试期间 注入
 */

@SpringBootTest
class Springboot01ApplicationTests {

	@Autowired
	Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	void testHelloService(){
		boolean b = ioc.containsBean("helloService");
		System.out.println(b);
	}

	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
