package com.example.calculator;

import static com.example.calculator.ResultBuilder.getResult;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/basic")
public class CalculatorController {

   @GetMapping("/add")
   public ApiResult add(@RequestParam BigDecimal augend, @RequestParam BigDecimal addend ) {
      return getResult(augend.add(addend));
   }

   @GetMapping("/subtract")
   public ApiResult subtract(@RequestParam BigDecimal minuent, @RequestParam BigDecimal subtrahend) {
      return getResult(minuent.subtract(subtrahend));
   }

   @GetMapping("/multiply")
   public ApiResult multiply(@RequestParam BigDecimal multiplier, @RequestParam BigDecimal multiplicand) {
      return getResult(multiplier.multiply(multiplicand));
   }

   @GetMapping("/divide")
   public ApiResult divide(@RequestParam BigDecimal dividend, @RequestParam BigDecimal divisor) {
      return getResult(dividend.divide(divisor, RoundingMode.HALF_EVEN));
   }

}
