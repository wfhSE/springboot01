package com.mine.springboot01.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author wfh@王丰华lag,com
 * @date 2019/11/29 15:34
 * 将配置文件中配置的每一个属性的值 映射到该组件中
 * @ConfigurationProperties 告诉springboot将本类中呃所有属性和配置文件中的相关属性进行绑定
 * 属性prefix 告诉容器配置文件中哪个下面的属性进行一一映射
 * 只有这个组件是容器中的组件 才能使用容器提供的功能 @Component
 */
@Component
@ConfigurationProperties(prefix = "person")
//@PropertySource(value = {"classpath:person.properties"})
public class Person {
	private String name;
	private Integer age;
	private boolean boss;
	private Date birth;

	private Map<String,Object> map;
	private List<Object> list;
	private Dog dog;

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				", boss=" + boss +
				", birth=" + birth +
				", map=" + map +
				", list=" + list +
				", dog=" + dog +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isBoss() {
		return boss;
	}

	public void setBoss(boolean boss) {
		this.boss = boss;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
