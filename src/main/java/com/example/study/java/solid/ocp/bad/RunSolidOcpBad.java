package com.example.study.java.solid.ocp.bad;

/**
 * author : ms.Lee
 * date   : 2024-02-19
 */
public class RunSolidOcpBad {

  public static void main(String[] args) {

    HelloProgrammer helloProgrammer = new HelloProgrammer();

    Programmer java = new Programmer("Java");
    Programmer cpp = new Programmer("C++");

    helloProgrammer.hello(java);
    helloProgrammer.hello(cpp);
  }
}
