package com.example.project.exception;

/**
 * 비즈니스 로직에서 발생하는 예외를 처리하기 위한 예외 클래스입니다.
 *
 * @author Exception Team
 * @version 1.0
 * @since 2024-01-01
 */
public class BusinessException extends RuntimeException {

    private final String errorCode;

    /**
     * 에러 코드와 메시지로 BusinessException을 생성합니다.
     *
     * @param errorCode 에러 코드
     * @param message 에러 메시지
     */
    public BusinessException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * 에러 코드를 반환합니다.
     *
     * @return 에러 코드
     */
    public String getErrorCode() {
        return errorCode;
    }
}