package com.Deisha.WorkingOnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkingOnitApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(WorkingOnitApplication.class, args);

		MyFirstComponent myFirstComponent = ctx.getBean("myFirstComponent", MyFirstComponent.class);
		System.out.println(myFirstComponent.sayHello());
	}
}
