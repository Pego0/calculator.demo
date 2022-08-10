package sky.pro.calculator.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RequestMapping("/calculator")
@RestController

public class CalculatorController {
    private final MethodsService methodsService;

    public CalculatorController(MethodsService methodsService) {
        this.methodsService = methodsService;
    }

    @GetMapping
    public String welcome() {
        return methodsService.welcome();
    }
    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value =  "num2", required = false) int num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не превильно переданы параметры!";
        } else {
            return num1 + " + " + num2 + " = " + methodsService.plus(num1, num2);
        }
    }
    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value =  "num2", required = false) int num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не превильно переданы параметры!";
        } else {
            return num1 + " - " + num2 + " = " + methodsService.minus(num1, num2);
        }
    }
    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) int num1, @RequestParam(value =  "num2", required = false) int num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не превильно переданы параметры!";
        } else {
        return num1 + " * " + num2 + " = " + methodsService.multiply(num1, num2);
        }
    }
    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) float num1, @RequestParam(value =  "num2", required = false) float num2) {
        if (Objects.isNull(num1) || Objects.isNull(num2)) {
            return "Не превильно переданы параметры!";
        } else if (num2 == 0.0) {
            return "На ноль делить нельзя!";
        } else {
            return num1 + " / " + num2 + " = " + methodsService.divide(num1, num2);
        }
    }
}
