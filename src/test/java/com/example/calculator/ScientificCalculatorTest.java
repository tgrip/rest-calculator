package com.example.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;


public class ScientificCalculatorTest {

   private ScientificCalculator _scientificCalculator = new ScientificCalculator();

   @Test
   void calculateFactorial() {
      assertEquals(BigInteger.ONE, _scientificCalculator.calculateFactorial(0));
      assertEquals(BigInteger.ONE, _scientificCalculator.calculateFactorial(1));
      assertEquals(BigInteger.TWO, _scientificCalculator.calculateFactorial(2));
      assertEquals(BigInteger.valueOf(120), _scientificCalculator.calculateFactorial(5));
   }

   @Test
   void calculateFactorial_BigNumber() {
      assertEquals(BigInteger.valueOf(2432902008176640000L), _scientificCalculator.calculateFactorial(20));
      assertEquals(new BigInteger("815915283247897734345611269596115894272000000000"), _scientificCalculator.calculateFactorial(40));
   }

   @Test
   void isPrime() {
      assertFalse(_scientificCalculator.isPrime(1));
      assertTrue(_scientificCalculator.isPrime(2));
      assertTrue(_scientificCalculator.isPrime(3));
      assertFalse(_scientificCalculator.isPrime(6));
      assertTrue(_scientificCalculator.isPrime(7));
      assertFalse(_scientificCalculator.isPrime(10));
   }

   @Test
   void isPrime_BiggerNumbers() {
      assertTrue(_scientificCalculator.isPrime(99877));
      assertFalse(_scientificCalculator.isPrime(324234));
   }
}