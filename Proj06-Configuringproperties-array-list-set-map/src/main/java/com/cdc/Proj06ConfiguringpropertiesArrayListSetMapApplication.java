package com.cdc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cdc.sbeans.Employe;

@SpringBootApplication
public class Proj06ConfiguringpropertiesArrayListSetMapApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Proj06ConfiguringpropertiesArrayListSetMapApplication.class,
				args);
		Employe emp = context.getBean("emp", Employe.class);
		System.out.println(emp);
	}

}
