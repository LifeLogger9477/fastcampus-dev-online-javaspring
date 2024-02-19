package com.example.study.java.collectionExample;

import java.util.*;

/**
 * author : ms.Lee
 * date   : 2024-02-19
 */
public class RunCollection {

  public static void main(String[] args) {

    // list test
    testList();
    System.out.println();

    // set test
    testSet();
    System.out.println();

    // queue test
    testQueue();
    System.out.println();

    // stack test
    testStack();
    System.out.println();

    // map test
    testMap();
  }

  public static void testList() {

    System.out.println("TEST LIST");

    List<Integer> list = new ArrayList<>();

    list.add(1);
    list.add(5);
    list.add(12);

    System.out.println(list.get(1));
  }

  public static void testSet() {

    System.out.println("TEST SET");

    Set<Integer> set = new HashSet<>();

    set.add(1);
    set.add(1);
    set.add(1);
    set.add(1);
    set.add(2);
    set.add(3);

    System.out.println(set.size());   // --> 중복 허용을 하지 않으므로 3이 된다.
  }

  // FIFO 방식
  private static void testQueue() {

    System.out.println("TEST QUEUE");

    Queue<Integer> queue = new PriorityQueue<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);

    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }

  private static void testStack() {

    System.out.println("TEST STACK");

    Stack<Integer> stack = new Stack<>();

    stack.add(1);
    stack.add(2);
    stack.add(3);
    stack.add(4);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }

  private static void testMap() {

    System.out.println("TEST MAP");

    Map<String, Integer> map = new HashMap<>();

    map.put("danny", 1);
    map.put("amy", 2);
    map.put("ben", 3);
    map.put("clyne", 4);

    System.out.println(map.get("danny"));
    System.out.println(map.get("elliot"));  // --> null 출력
    // --> 해당 키가 없을 때는 기본값을 지정하여 출력할 수 있다.
    System.out.println(map.getOrDefault("error", 100));
  }
}
