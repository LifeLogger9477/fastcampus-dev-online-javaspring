package com.example.study.java.abstractClass;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * author : ms.Lee
 * date   : 2024-02-18
 */
public class RunAbstractClass {

  public static void main(String[] args) {

    Meeting meeting = new Meeting();

    Set<String> participants = new HashSet<String>();
    participants.add("danny");

    meeting.validateAndUpdate(
        new UpdateMeeting(
            "미팅룸 1",
            "책읽기",
            participants,
            "책읽기 스터디",
            ZonedDateTime.now(),
            ZonedDateTime.now()
        )
    );
  }
}
