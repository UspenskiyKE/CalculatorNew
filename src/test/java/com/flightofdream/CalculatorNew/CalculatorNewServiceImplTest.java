package com.flightofdream.CalculatorNew;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorNewServiceImplTest {
    static final String GREETING_STRING = "<h1 align=\"center\">Добро пожаловать в калькулятор!</h1>";
    static final String GREETING_STRING2 = "Добро пожаловать в калькулятор!";

    @Test
    public void calcHello1() {
        String s = "<h1 align=\"center\">Добро пожаловать в калькулятор!</h1>";
        assertEquals(GREETING_STRING, s);
    }

    @Test
    public void calcHello2() {
        String s = "Добро пожаловать в калькулятор!";
        assertEquals(GREETING_STRING2, s);
    }

    @Test
    public void calcPlus1() {
        int result = 3 + 5;
        int z = 8;
        assertEquals(result, z);
    }

    @Test
    public void calcPlus2() {
        int result = 10 + 20;
        int z = 30;
        assertEquals(result, z);
    }

    @Test
    public void calcMinus1() {
        int result = 3 - 5;
        int z = -2;
        assertEquals(result, z);
    }
    @Test
    public void calcMinus2() {
        int result = 10 - 20;
        int z = -10;
        assertEquals(result, z);
    }
    @Test
    public void calcMultiply1() {
        int result = 3*5;
        int z = 15;
        assertEquals(result, z);
    }
    @Test
    public void calcMultiply2() {
        int result = 10*20;
        int z = 200;
        assertEquals(result, z);
    }

    @Test
    public void calcDivide1() {
        double result = 3.0/5;
        double z = 0.6;
        assertEquals(result,z,0.0);
    }
    @Test
    public void calcDivide2() {
        double result = 10.0/20;
        double z = 0.5;
        assertEquals(result, z,0);
    }


    @Test
    public void calcDivide4() {
        Throwable exception = assertThrows(
                DivisionByZeroException.class,
                () -> {
                    throw new DivisionByZeroException("Division By Zero Error!");
                }
        );
        assertEquals("Division By Zero Error!", exception.getMessage());
    }

}