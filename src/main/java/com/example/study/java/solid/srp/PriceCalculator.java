package com.example.study.java.solid.srp;

import java.math.BigDecimal;

/**
 * author : ms.Lee
 * date   : 2024-02-19
 */
public class PriceCalculator {

  public BigDecimal calculateTotalPrice(
      BigDecimal totalPrice,
      AbstractItem item
  ) {

    return totalPrice.add(
        item.getPrice()
            .multiply(BigDecimal.ONE.subtract(item.getDiscount()))
    );
  }
}
