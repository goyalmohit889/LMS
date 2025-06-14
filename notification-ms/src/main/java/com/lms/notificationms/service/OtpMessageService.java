package com.lms.notificationms.service;

import com.lms.notificationms.domain.dto.OtpMessage;
import org.springframework.stereotype.Service;

@Service
public class OtpMessageService {
    private final MailerService mailerService;

    public OtpMessageService(final MailerService mailerService) {
        this.mailerService = mailerService;
    }

    public void sendOtpEmail(OtpMessage otpMessage) {
        mailerService.sendOtpMail(otpMessage);
    }
}
