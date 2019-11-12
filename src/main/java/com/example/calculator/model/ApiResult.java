package com.example.calculator.model;

public class ApiResult {

   private String result;
   private String error;

   private ApiResult() {
   }

   static ApiResult withResult(String resultMessage) {
      ApiResult apiResult = new ApiResult();
      apiResult.result = resultMessage;
      return apiResult;
   }

   static ApiResult withError(String errorMessage) {
      ApiResult apiResult = new ApiResult();
      apiResult.error = errorMessage;
      return apiResult;
   }

   public String getResult() {
      return result;
   }

   public String getError() {
      return error;
   }
}
