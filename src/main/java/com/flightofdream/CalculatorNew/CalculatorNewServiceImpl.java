package com.flightofdream.CalculatorNew;

import org.springframework.stereotype.Service;

@Service
public class CalculatorNewServiceImpl implements CalculatorNewService {

    public String calcHello() {
        return  "<h1 align=\"center\">Добро пожаловать в калькулятор!</h1>";
    }

    public int calcPlus(int num1, int num2) {
        int result=num1+num2;
        return result;
    }

    public int calcMinus(int num1, int num2) {
        int result=num1-num2;
        return result;
    }

    public int calcMultiply(int num1, int num2) {
        int result=num1*num2;
        return result;
    }

    public double calcDivide(double num1, double num2) {
        if(num2!=0){
            double result = num1 / num2;
            return  result;}else{
            throw new DivisionByZeroException("Division By Zero Error!");
        }
    }
}
