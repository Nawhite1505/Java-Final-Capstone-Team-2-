package com.techelevator.service;

public interface EmailSender {
    void send(String to, String subject, String body);
}
