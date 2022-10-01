package calculator.controller;

import calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String hello (){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plus (@RequestParam(name = "num1", required = false) Integer num1,
                        @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Введены не все значения";
        int plus = calculatorService.plus(num1, num2);
        return num1 + "+" + num2 + "=" + plus;
    }

    @GetMapping(path = "/minus")
    public String minus (@RequestParam(name = "num1", required = false) Integer num1,
                         @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Введены не все значения";
        int minus = calculatorService.minus(num1, num2);
        return num1 + "-" + num2 + "=" + minus;
    }

    @GetMapping(path = "/multiply")
    public String multiply (@RequestParam(name = "num1", required = false) Integer num1,
                            @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Введены не все значения";
        int multiply = calculatorService.multiply(num1, num2);
        return num1 + "*" + num2 + "=" + multiply;
    }

    @GetMapping(path = "/divide")
    public String divide (@RequestParam(name = "num1", required = false) Integer num1,
                          @RequestParam(name = "num2", required = false) Integer num2) {
        if (num1 == null || num2 == null) return "Введены не все значения";
        if (num2 == 0) return "На ноль делить нельзя";
        int divide = calculatorService.divide(num1, num2);
        return num1 + "/" + num2 + "=" + divide;
    }
}
