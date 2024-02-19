package com.example.study.java.abstractClass;

import java.time.ZonedDateTime;

/**
 * author : ms.Lee
 * date   : 2024-02-18
 */
public class Todo {

  private String title;
  private ZonedDateTime startAt;
  private ZonedDateTime endAt;
  private boolean deleteYn;

  private String description;

  public void update(
      String title,
      ZonedDateTime startAt,
      ZonedDateTime endAt,
      String description
  ) {

    if (this.deleteYn) {

      throw new RuntimeException("이미 삭제되어 업데이트할 수 없습니다.");
    }

    this.title = title;
    this.startAt = startAt;
    this.endAt = endAt;
    this.description = description;
  }
}
