package com.example.study.java.testJUnit5;

/**
 * author : ms.Lee
 * date   : 2024-02-22
 */
public class CalculatorException {

  public int sum(int a, int b) {

    if (a < 0 || b < 0) {

      // 해당 조건에 대해서는 요구사항을 받지 않음
      throw new RuntimeException();
    }

    return a + b;
  }
}
