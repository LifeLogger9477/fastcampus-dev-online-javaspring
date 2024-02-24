package com.example.study.java.testJUnit5

import spock.lang.Specification

/**
 * author : ms.Lee
 * date   : 2024-02-25
 */
class CalculatorExceptionTest1 extends Specification {

    def "sum_exception"() {

        given:
        def a = -1
        def b = 10
        def calculator = new CalculatorException();

        when:
        def actual = calculator.sum(a, b)

        then:
        thrown(RuntimeException.class)
    }
}
