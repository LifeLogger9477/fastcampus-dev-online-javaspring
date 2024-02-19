package com.example.study.java.abstractClass;

import java.time.ZonedDateTime;
import java.util.Set;

/**
 * author : ms.Lee
 * date   : 2024-02-18
 */
public class Meeting extends AbstractEvent {

  private String meetingRoom;
  private String agenda;
  private Set<String> participants;

  public void update(
      String title,
      ZonedDateTime startAt,
      ZonedDateTime endAt,
      String meetingRoom,
      String agenda,
      Set<String> participants
  ) {

    if (this.deleteYn) {

      throw new RuntimeException("이미 삭제되어 업데이트할 수 없습니다.");
    }

    this.meetingRoom = meetingRoom;
    this.agenda = agenda;
    this.participants = participants;
  }

  @Override
  protected void update(AbstractAuditableEvent event) {

    // Meeting update용 클래스 작성 필요
    UpdateMeeting meeting = (UpdateMeeting) event;
    this.participants = meeting.getParticipants();
    this.agenda = meeting.getAgenda();
    this.meetingRoom = meeting.getMeetingRoom();
  }
}
