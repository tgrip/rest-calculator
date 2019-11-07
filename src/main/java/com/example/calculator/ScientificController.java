package com.example.calculator;

import static com.example.calculator.Result.getResult;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/scientific")
public class ScientificController {

   private final ScientificCalculator _scientificCalculator;

   public ScientificController(ScientificCalculator scientificCalculator) {
      _scientificCalculator = scientificCalculator;
   }

   @GetMapping("/square/{factor}")
   public Map<String, String> square(@PathVariable BigDecimal factor ) {
      return getResult(factor.multiply(factor));
   }

   @GetMapping("/factorial/{number}")
   public Map<String, String> factorial(@PathVariable int number ) {
      BigInteger result = _scientificCalculator.calculateFactorial(number);
      return getResult(result);
   }

   @GetMapping("/prime/{number}")
   public Map<String, String> prime(@PathVariable long number ) {
      return getResult(_scientificCalculator.isPrime(number));
   }
}
