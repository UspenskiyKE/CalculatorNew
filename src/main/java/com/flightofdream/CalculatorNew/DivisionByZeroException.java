package com.flightofdream.CalculatorNew;

public class DivisionByZeroException extends IllegalArgumentException{
    public DivisionByZeroException(String message) {
        super(message);
    }
}