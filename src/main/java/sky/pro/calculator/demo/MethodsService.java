package sky.pro.calculator.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Service
public class MethodsService {
    public static String welcome() {
        return "Добро пожаловать в калькулятор!";
    }
    public int plus(int num1, int num2){
        return num1 + num2;
    }
    public int minus(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public float divide(float num1, float num2){
        return num1 / num2;
    }
}
