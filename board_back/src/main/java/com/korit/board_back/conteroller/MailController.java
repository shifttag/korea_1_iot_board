package com.korit.board_back.conteroller;

import com.korit.board_back.dto.mail.SendMailRequestDto;
import com.korit.board_back.service.MailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/mail")
public class MailController {
    private final MailService mailService;

    @PostMapping("/send")
    public String sendEmail(@RequestBody SendMailRequestDto mailDto) throws MessagingException {


        return mailService.sendSimpleMessage(mailDto.getEmail(), mailDto.getUsername());
    }

    @GetMapping("/verify")
    public String verifyEmail(@RequestParam String token) throws MessagingException {
        return mailService.verifyEmail(token);
    }
}
