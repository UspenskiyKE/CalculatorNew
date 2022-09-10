package com.flightofdream.CalculatorNew;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/calculator")
@RestController
public class CalculatorNewController {
    private final CalculatorNewService calculatorService;

    public CalculatorNewController(CalculatorNewService calculatorService) {
        this.calculatorService=calculatorService;
    }

    @GetMapping()
    public String hello() {
        return calculatorService.calcHello();
    }

    @GetMapping(path="/plus")
    public String calcPlus(@RequestParam("num1") int userNum1,@RequestParam("num2") int userNum2) {
        int r=calculatorService.calcPlus(userNum1,userNum2);
        return userNum1+" + "+userNum2+" = "+r;
    }

    @GetMapping(path="/minus")
    public String calcMinus(@RequestParam("num1") int userNum1,@RequestParam("num2") int userNum2) {
        int r=calculatorService.calcMinus(userNum1,userNum2);
        return userNum1+" - "+userNum2+" = "+r;
    }

    @GetMapping(path="/multiply")
    public String calcMultiply(@RequestParam("num1") int userNum1,@RequestParam("num2") int userNum2) {
        int r=calculatorService.calcMultiply(userNum1, userNum2);
        return userNum1+" * "+userNum2+" = "+r;
    }

    @GetMapping(path="/divide")
    public String calcDivide(@RequestParam("num1") int userNum1,@RequestParam("num2") int userNum2) {
        if (userNum2!=0) {
            double r=calculatorService.calcDivide(userNum1,userNum2);
            return userNum1+" / "+userNum2+" = "+r;
        }else{
            return "<b>Ошибка:</b> Деление на ноль!";
        }

    }
}

