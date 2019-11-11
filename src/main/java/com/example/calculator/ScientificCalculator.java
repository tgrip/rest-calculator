package com.example.calculator;

import java.math.BigInteger;

import org.springframework.stereotype.Service;


@Service
public class ScientificCalculator {

   public BigInteger calculateFactorial( int number ) {
      if (number < 0) {
         throw new ArithmeticException("factorial is only defined for positive numbers");
      }
      BigInteger result = BigInteger.ONE;
      for (int i = number; i > 0; i--) {
         result = result.multiply(BigInteger.valueOf(i));
      }
      return result;
   }

   public boolean isPrime( long number ) {
      if ( number <= 1) {
         return false;
      }
      for (int i = 2; i * i <= number; i++) {
         if (number % i == 0) {
            return false;
         }
      }
      return true;
   }
}
