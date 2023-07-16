package com.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    public int add(int num1 , int num2){
        return num1 + num2;
    }

    public int subtract(int num1 , int num2){
        return num1 - num2;
    }

    public int multiply(int num1 , int num2){
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2==0){
            throw new ArithmeticException("Given Number Cannot divide by Zero");
        }

        return  num1/num2;
    }
}
