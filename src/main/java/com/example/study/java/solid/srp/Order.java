package com.example.study.java.solid.srp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * author : ms.Lee
 * date   : 2024-02-19
 */
public class Order {

  // --> 하나의 주문에는 여러 상품이 존재할 수 있음
  private List<AbstractItem> items;

  // --> 전체 상품의 가격을 관리할 수 있는 변수 존재 : 초기 = 0
  private BigDecimal totalPrice;

  // --> 가격 정책에 대한 부분은 아래 클래스에서만 처리한다.
  private final PriceCalculator priceCalculator;

  public Order() {

    this.items = new ArrayList<>();
    this.totalPrice = BigDecimal.ZERO;

    this.priceCalculator = new PriceCalculator();
  }

  public void addItem(AbstractItem item) {

    this.items.add(item);
    // --> item을 추가하면서 실시간으로 totalPrice 계산
    calculateTotalPrice(item);
  }

  private void calculateTotalPrice(AbstractItem item) {

    this.totalPrice =
        priceCalculator.calculateTotalPrice(this.totalPrice, item);
  }

  public BigDecimal getTotalPrice() {

    return totalPrice;
  }
}
