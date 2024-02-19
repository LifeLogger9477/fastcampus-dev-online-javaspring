package com.example.study.java.solid.srp;

import java.math.BigDecimal;

/**
 * author : ms.Lee
 * date   : 2024-02-19
 */
public class Shoe extends AbstractItem {

  private final int size;
  private final String brand;
  private final String color;

  public Shoe(
      int size,
      String brand,
      String color,
      String name,
      BigDecimal price,
      BigDecimal discount) {

    super(name, price, discount);

    this.size = size;
    this.brand = brand;
    this.color = color;
  }

  public int getSize() {

    return size;
  }

  public String getBrand() {

    return brand;
  }

  public String getColor() {

    return color;
  }
}
