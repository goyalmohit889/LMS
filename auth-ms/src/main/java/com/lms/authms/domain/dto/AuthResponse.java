package com.lms.authms.domain.dto;

import java.io.Serializable;

public record AuthResponse(
        String message
) implements Serializable {
}
