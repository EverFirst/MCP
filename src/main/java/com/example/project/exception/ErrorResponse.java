package com.example.project.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * API 에러 응답을 위한 기본 DTO 클래스입니다.
 * 에러 코드, 에러 메시지, 발생 시간을 포함합니다.
 *
 * @author Exception Team
 * @version 1.0
 * @since 2024-01-01
 */
@Getter
@Builder
public class ErrorResponse {

    /** 에러 코드 */
    private final String errorCode;

    /** 에러 메시지 */
    private final String errorMessage;

    /** 에러 발생 시간 */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private final LocalDateTime timestamp;

    /**
     * 에러 응답 객체를 생성합니다.
     *
     * @param errorCode 에러 코드
     * @param errorMessage 에러 메시지
     * @return ErrorResponse 객체
     */
    public static ErrorResponse of(String errorCode, String errorMessage) {
        return ErrorResponse.builder()
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .timestamp(LocalDateTime.now())
                .build();
    }
}