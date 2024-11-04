package com.cdc;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import com.cdc.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/cdc/cfgs/applicationContext.xml")
public class Proj03_DependencyInjection_StrategyDesignPatternLooseCoupling {
	@Bean
	public LocalDateTime createDate() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Proj03_DependencyInjection_StrategyDesignPatternLooseCoupling.class, args);
		Vehicle vehicle=ctx.getBean("Vehicle",Vehicle.class);
		vehicle.move("Hyderabad", "Anantapur");		
		String message=vehicle.wishMessage("Varun");
		System.out.println(message);
		((ConfigurableApplicationContext) ctx).close();
	}

}
