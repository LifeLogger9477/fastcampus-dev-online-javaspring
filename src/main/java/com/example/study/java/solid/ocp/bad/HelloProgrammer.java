package com.example.study.java.solid.ocp.bad;

/**
 * author : ms.Lee
 * date   : 2024-02-19
 */
public class HelloProgrammer {

  public void hello(Programmer programmer) {

    if ("Java".equals(programmer.getType())) {

      System.out.println("자바 프로그래머");
    }
    else if ("C++".equals(programmer.getType())) {

      System.out.println("C++ 프로그래머");
    }
  }
}
