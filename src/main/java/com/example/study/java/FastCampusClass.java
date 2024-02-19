package com.example.study.java;

/**
 * author : ms.Lee
 * date   : 2024-02-17
 */
public class FastCampusClass {

  public static void main(String[] args) {

    System.out.println("===== make star =====");
    makeStar();

    System.out.println();

    System.out.println("===== make tree =====");
    makeTree();
  }

  // 1. increase '*'
  public static void makeStar() {

    int size = 5;
    int floor = 1;

    while (floorLess(size, floor)) {

      for (int i = 0; i < floor; i++) {

        System.out.print("*");
      }

      System.out.println();
      floor++;
    }
  }

  private static boolean floorLess(int size, int floor) {
    return floor <= size;
  }

  // 2. tree
  public static void makeTree() {

    int floor = 1;
    int size = 5;

    for (int i = floor; i < size+1; i++) {

      // space
      for (int j = 0; j < size - i; j++) {

        System.out.print(" ");
      }

      // star
      for (int j = 0; j < i * 2 - 1; j++) {

        System.out.print("*");
      }

      System.out.println();
    }
  }
}
