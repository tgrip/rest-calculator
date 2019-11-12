package com.example.calculator.basic;

import static com.example.calculator.model.ResultBuilder.getResult;
import static com.example.calculator.model.ResultBuilder.getResultFromError;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.calculator.model.ApiResult;


@RestController
@RequestMapping("/basic")
public class BasicController {

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
      if (divisor.equals(BigDecimal.ZERO)) {
         return getResultFromError("no division by null");
      }
      return getResult(dividend.divide(divisor, RoundingMode.HALF_EVEN));
   }

}
