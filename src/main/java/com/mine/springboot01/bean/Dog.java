package com.mine.springboot01.bean;

/**
 * @author wfh@王丰华lag,com
 * @date 2019/11/29 15:36
 */
public class Dog {
	private String dname;
	private Integer age;

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog{" +
				"dname='" + dname + '\'' +
				", age=" + age +
				'}';
	}
}
