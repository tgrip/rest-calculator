package com.example.calculator;

import java.math.BigDecimal;
import java.util.Map;


public class Result {

   public static Map<String, String> getResult( BigDecimal result ) {
      return Map.of("result", result.toPlainString());
   }

   public static Map<String, String> getResult( Object result ) {
      return Map.of("result", result.toString());
   }
}
