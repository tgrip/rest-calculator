package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

import com.example.calculator.scientific.ScientificCalculatorService;


class ScientificCalculatorServiceTest {

   private ScientificCalculatorService _scientificCalculatorService = new ScientificCalculatorService();

   @Test
   void calculateFactorial() {
      assertEquals(BigInteger.ONE, _scientificCalculatorService.calculateFactorial(0));
      assertEquals(BigInteger.ONE, _scientificCalculatorService.calculateFactorial(1));
      assertEquals(BigInteger.TWO, _scientificCalculatorService.calculateFactorial(2));
      assertEquals(BigInteger.valueOf(120), _scientificCalculatorService.calculateFactorial(5));
   }

   @Test
   void calculateFactorial_BigNumber() {
      assertEquals(BigInteger.valueOf(2432902008176640000L), _scientificCalculatorService.calculateFactorial(20));
      assertEquals(new BigInteger("815915283247897734345611269596115894272000000000"), _scientificCalculatorService.calculateFactorial(40));
   }

   @Test
   void isPrime() {
      assertFalse(_scientificCalculatorService.isPrime(1));
      assertTrue(_scientificCalculatorService.isPrime(2));
      assertTrue(_scientificCalculatorService.isPrime(3));
      assertFalse(_scientificCalculatorService.isPrime(6));
      assertTrue(_scientificCalculatorService.isPrime(7));
      assertFalse(_scientificCalculatorService.isPrime(10));
   }

   @Test
   void isPrime_BiggerNumbers() {
      assertTrue(_scientificCalculatorService.isPrime(99877));
      assertFalse(_scientificCalculatorService.isPrime(324234));
   }
}