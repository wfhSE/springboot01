package com.mine.springboot01.config;

import com.mine.springboot01.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wfh@王丰华lag,com
 * @date 2019/11/29 17:29
 * //告诉springboot这是一个配置类 来替代spring的配置文件
 *
 */

@Configuration
public class myAPPConfig {
	//将方法的返回值添加到容器中 容器中这个组件默认的id就是这个方法名
	@Bean
	public HelloService helloService(){
		System.out.println("给容器中添加组件了");
		return new HelloService();
	}
}
