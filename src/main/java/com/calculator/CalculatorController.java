package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private Calculator calculator;

    @GetMapping("/add")
    public int add(@RequestParam int num1 , @RequestParam int num2 ){
        return calculator.add(num1, num2);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam int num1 , @RequestParam int num2){
        return calculator.subtract(num1,num2);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam int num1 , @RequestParam int num2){
        return calculator.multiply(num1,num2);
    }

    @GetMapping("/divide")
    public double divide(@RequestParam int num1 , @RequestParam int num2) throws IllegalAccessException {
        return calculator.divide(num1,num2);
    }





}
