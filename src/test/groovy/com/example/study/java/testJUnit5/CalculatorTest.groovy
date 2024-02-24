package com.example.study.java.testJUnit5

import spock.lang.Specification

/**
 * author : ms.Lee
 * date   : 2024-02-25
 */
class CalculatorTest1 extends Specification {

    def "sum"() {

        given:
        def a = 10
        def b = 20
        def expected = 30

        def calculator = new Calculator()

        when:
        def actual = calculator.sum(a, b)

        then:
        actual == expected
    }

    def "sum_where"() {

        given:
        def calculator = new Calculator()

        when:
        def actual = calculator.sum(a, b)

        then:
        actual == expected

        where:
        a   | b     | expected
        10  | 20    | 30
        -1  | 1     | 0
        1   | -1    | 0
        0   | 0     | 0
        100 | 1000 | 1100
    }

    def "sum_fail"() {

        given:
        def calculator = new Calculator()

        when:
        def actual = calculator.sum(a, b)

        then:
        actual == expected

        where:
        a   | b    | expected
        10  | 20   | 30
        -1  | 1    | 0
        1   | -1   | 0
        0   | 0    | 0
        100 | 1000 | 100
    }
}
