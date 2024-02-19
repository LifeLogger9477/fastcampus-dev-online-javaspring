package com.example.study.java.abstractClass;

import java.time.ZonedDateTime;

/**
 * author : ms.Lee
 * date   : 2024-02-18
 * 값을 업데이트하기 위한 클래스
 */
public class AbstractAuditableEvent {

  private String title;
  private ZonedDateTime startAt;
  private ZonedDateTime endAt;

  public AbstractAuditableEvent(
      String title,
      ZonedDateTime startAt,
      ZonedDateTime endAt
  ) {

    this.title = title;
    this.startAt = startAt;
    this.endAt = endAt;
  }

  public String getTitle() {

    return this.title;
  }

  public ZonedDateTime getStartAt() {

    return this.startAt;
  }

  public ZonedDateTime getEndAt() {

    return this.endAt;
  }
}
