package io.cards.spring.exercises.homework_w1.service;

import io.cards.spring.exercises.homework_w1.domain.Message;

public class FileStoreRepository implements MessageRepository {

  @Override
  public void store(Message message) {
    System.out.println("Hey:" + message);
  }
}
