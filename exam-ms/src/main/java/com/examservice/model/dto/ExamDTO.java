package com.examservice.model.dto;

import java.time.LocalDateTime;

public record ExamDTO(
        Long id,
        String examName,
        LocalDateTime examDate,
        Long studentId,
//        Long notificationId,
        String status
){
}
