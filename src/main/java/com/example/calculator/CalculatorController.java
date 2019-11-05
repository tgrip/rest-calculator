package com.example.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {

   @GetMapping("/add")
   public Map<String, String> add(@RequestParam BigDecimal augend, @RequestParam BigDecimal addend ) {
      return getResult(augend.add(addend));
   }

   private Map<String, String> getResult( BigDecimal result ) {
      return Map.of("result", result.toPlainString());
   }

   // TODO: Check Math Context
   @GetMapping("/subtract")
   public Map<String, String> subtract(@RequestParam BigDecimal minuent, @RequestParam BigDecimal subtrahend) {
      return getResult(minuent.subtract(subtrahend));
   }

   @GetMapping("/multiply")
   public Map<String, String> multiply(@RequestParam BigDecimal multiplier, @RequestParam BigDecimal multiplicand) {
      return getResult(multiplier.multiply(multiplicand));
   }

   @GetMapping("/divide")
   public Map<String, String> divide(@RequestParam BigDecimal dividend, @RequestParam BigDecimal divisor) {
      return getResult(dividend.divide(divisor, RoundingMode.HALF_EVEN));
   }

}
