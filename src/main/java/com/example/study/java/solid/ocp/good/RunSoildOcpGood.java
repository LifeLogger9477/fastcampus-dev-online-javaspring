package com.example.study.java.solid.ocp.good;

/**
 * author : ms.Lee
 * date   : 2024-02-19
 */
public class RunSoildOcpGood {

  public static void main(String[] args) {

    HelloProgrammer helloProgrammer = new HelloProgrammer();

    helloProgrammer.hi(new JavaProgrammer());
    helloProgrammer.hi(new CppProgrammer());
    helloProgrammer.hi(new PythonProgrammer());
  }
}
