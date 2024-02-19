package com.example.study.java.abstractClass;

import java.time.ZonedDateTime;
import java.util.Set;

/**
 * author : ms.Lee
 * date   : 2024-02-18
 */
public class UpdateMeeting extends AbstractAuditableEvent {

  private String meetingRoom;
  private String agenda;
  private Set<String> participants;

  public UpdateMeeting(
      String meetingRoom,
      String agenda,
      Set<String> participants,
      String title,
      ZonedDateTime startAt,
      ZonedDateTime endAt
  ) {

    super(title, startAt, endAt);

    this.meetingRoom = meetingRoom;
    this.agenda = agenda;
    this.participants = participants;
  }

  public String getMeetingRoom() {
    return meetingRoom;
  }

  public String getAgenda() {
    return agenda;
  }

  public Set<String> getParticipants() {
    return participants;
  }
}
