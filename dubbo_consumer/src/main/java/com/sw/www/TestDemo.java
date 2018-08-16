package com.sw.www;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		for (int i = 0; i < 222; i++) {
			// 初始化Spring
			DemoService demoService = (DemoService) new ClassPathXmlApplicationContext("applicationConsumer.xml").getBean("demoService"); // 获取远程服务代理
			demoService.sayHello(); // 执行远程方法
			// System.in.read();
		}
	}
}
