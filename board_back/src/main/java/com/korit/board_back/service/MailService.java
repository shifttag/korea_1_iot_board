package com.korit.board_back.service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

public interface MailService {
    MimeMessage createMail(String mail, String token) throws MessagingException;
    String sendSimpleMessage(String sendEmail, String username) throws MessagingException;
    String verifyEmail(String token);
}
