package com.example.study.java.testJUnit5;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * author : ms.Lee
 * date   : 2024-02-22
 */
class CalculatorTest {

  // 기본
  @Test
  @DisplayName("더하기 테스트 - 기본")
  void sum() {

    // given
    Calculator calculator = new Calculator();
    int a = 10;
    int b = 5;

    int expected = 15;

    // when
    int actual = calculator.sum(a, b);

    // then
    assertEquals(expected, actual);
  }

  // 확장
  @ParameterizedTest
  @MethodSource("numberProvider")
  @DisplayName("더하기 테스트 - 확장")
  void sum_withProvider(int a, int b, int expected) {

    // given
    Calculator calculator = new Calculator();

    // when
    int actual = calculator.sum(a, b);

    // then
    assertEquals(expected, actual);
  }

  static Stream<Arguments> numberProvider() {

    return Stream.of(
        Arguments.arguments(10, 5, 15),
        Arguments.arguments(-10, -20, -30),
        Arguments.arguments(0, 0, 0),
        Arguments.arguments(10, -20, -10)
    );
  }

  @BeforeEach
  void beforeEach() {

    System.out.println("before each");
  }

  @AfterEach
  void afterEach() {

    System.out.println("after each");
  }

  @BeforeAll
  static void beforeAll() {

    System.out.println("before all");
  }

  @AfterAll
  static void afterAll() {

    System.out.println("after all");
  }

  @Test
  void test1() {

    System.out.println("TEST1");
  }

  @Test
  void test2() {

    System.out.println("TEST2");
  }

  @Test
  void test3() {

    System.out.println("TEST3");
  }
}