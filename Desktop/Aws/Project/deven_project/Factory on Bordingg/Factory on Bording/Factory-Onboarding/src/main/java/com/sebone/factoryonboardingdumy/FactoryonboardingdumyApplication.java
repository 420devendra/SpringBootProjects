package com.sebone.factoryonboardingdumy;

import com.sebone.factoryonboardingdumy.controller.FactoryProductContoller;
import com.sebone.factoryonboardingdumy.utility.GlobalResources;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.sebone.FactoryonboardingdumyApplication"})
public class FactoryonboardingdumyApplication {
	private static Logger logger = GlobalResources.getLogger(FactoryonboardingdumyApplication.class);
	public static void main(String[] args) {
		logger.info("Starting Rest Api Application!");
		SpringApplication.run(FactoryonboardingdumyApplication.class, args);
	}

}
