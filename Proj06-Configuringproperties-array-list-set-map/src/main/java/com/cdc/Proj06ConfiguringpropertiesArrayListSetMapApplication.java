package com.cdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cdc.sbeans.Employee;

@SpringBootApplication
public class Proj06ConfiguringpropertiesArrayListSetMapApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj06ConfiguringpropertiesArrayListSetMapApplication.class,
				args);
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
	}

}
