package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);


		Calculator calculator = new Calculator();

		//Test Addition
		int sum = calculator.add(10, 5);
		System.out.println("Sum : " + sum);

		//Test Subtract
		int difference = calculator.subtract(10,5);
		System.out.println("Difference : "+ difference);

		//Test Multiply
		int product = calculator.multiply(10,5);
		System.out.println("Product : " + product);

		//Test Division
		try {
			double quotient = calculator.divide(10, 5);
			System.out.println("Quotient : " + quotient);
		}catch (ArithmeticException e ){
			System.out.println("Error : " + e.getMessage());
		}

		try {
			double quotient = calculator.divide(10, 0);
			System.out.println("Quotient : " + quotient);
		}catch (ArithmeticException e ){
			System.out.println("Error : " + e.getMessage());
		}



	}

}
