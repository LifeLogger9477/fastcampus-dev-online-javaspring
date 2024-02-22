package com.example.study.java.testJUnit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * author : ms.Lee
 * date   : 2024-02-22
 */
class CalculatorExceptionTest {

  @ParameterizedTest
  @MethodSource("numberProviderForException")
  @DisplayName("더하기 테스트 - 음수 값이 입력되는 경우 예외 발생")
  void sumExceptionTest(int a, int b) {

    // given
    CalculatorException calculator = new CalculatorException();

    // when & then
    assertThrows(
        RuntimeException.class,
        () -> calculator.sum(a, b)
    );
  }

  static Stream<Arguments> numberProviderForException() {

    return Stream.of(
        Arguments.arguments(-10, 5),
        Arguments.arguments(1, -100)
    );
  }
}