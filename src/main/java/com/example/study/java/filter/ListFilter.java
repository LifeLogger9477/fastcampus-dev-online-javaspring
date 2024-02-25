package com.example.study.java.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * author : ms.Lee
 * date   : 2024-02-25
 */
public class ListFilter {

  public List<Integer> filterBy(List<Integer> target, int from, int to) {

    if (from >= to) {

      throw new RuntimeException(
          String.format(
              "from=%d 값이 to=%d 보다 크거나 같을 수 없습니다.",
              from,
              to
          )
      );
    }

    return target.stream()
        .filter(each -> from < each && to > each)
        .collect(Collectors.toList());
  }
}
