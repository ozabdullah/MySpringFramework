package com.myapplication;

import com.myapplication.calculator.Calculator;
import com.myapplication.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyapplicationApplication {

	public static void main(String[] args) throws  Exception{

		ApplicationContext container =  SpringApplication.run(MyapplicationApplication.class, args);

		Calculator calculator =  container.getBean("calculator", Calculator.class);

		System.out.println(calculator.getTotalCarpetCost(City.MCLEAN));
	}

}
