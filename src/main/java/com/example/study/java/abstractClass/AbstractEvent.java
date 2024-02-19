package com.example.study.java.abstractClass;

import java.time.ZonedDateTime;

/**
 * author : ms.Lee
 * date   : 2024-02-18
 */
public abstract class AbstractEvent {

  private String title;
  private ZonedDateTime startAt;
  private ZonedDateTime endAt;
  protected boolean deleteYn;

  public void validateAndUpdate(AbstractAuditableEvent event) {

    if (getDeletedYn()) {

      throw new RuntimeException("");
    }

    // Meeting, Todo에 대한 업데이트를 해주고
    update(event);
    // defaultUpdate 진행
    defaultUpdate(event);
  }

  // 구현체만 정의
  protected abstract void update(AbstractAuditableEvent event);

  private boolean getDeletedYn() {

    return this.deleteYn;
  }

  private void defaultUpdate(AbstractAuditableEvent event) {

    this.title = event.getTitle();
    this.startAt = event.getStartAt();
    this.endAt = event.getEndAt();
  }
}
