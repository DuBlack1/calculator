package calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public int divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
