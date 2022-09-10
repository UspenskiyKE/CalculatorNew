package com.flightofdream.CalculatorNew;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorNewServiceImplParamTest {
    @ParameterizedTest
    @CsvSource({
            "3, 5",
            "10, 20"
    })
    void calcPlus(int num1, int num2) {
        int result = num1 + num2;
        Assertions.assertEquals(result, num1+num2);
    }
    @ParameterizedTest
    @CsvSource({
            "3, 5",
            "10, 20"
    })
    void calcMinus(int num1, int num2) {
        int result = num1 - num2;
        Assertions.assertEquals(result, num1-num2);
    }

    @ParameterizedTest
    @CsvSource({
            "3, 5",
            "10, 20"
    })
    void calcMultiply(int num1, int num2) {
        int result = num1 * num2;
        Assertions.assertEquals(result, num1*num2);
    }

    @ParameterizedTest
    @CsvSource({
            "3.0, 5",
            "10.0, 20",
            "10.0, 0.0"
    })
    void calcDivide(double num1, double num2) {
        double result = num1 / num2;
        Assertions.assertEquals(result, num1/num2, 0.0);
        Throwable exception = assertThrows(
                DivisionByZeroException.class,
                () -> {
                    throw new DivisionByZeroException("Division By Zero Error!");
                }
        );
        Assertions.assertEquals("Division By Zero Error!", exception.getMessage());
    }
}
