package com.example.project.exception;

/**
 * 시스템 레벨에서 발생하는 예외를 처리하기 위한 예외 클래스입니다.
 *
 * @author Exception Team
 * @version 1.0
 * @since 2024-01-01
 */
public class SystemException extends RuntimeException {

    private final String errorCode;

    /**
     * 에러 코드와 메시지로 SystemException을 생성합니다.
     *
     * @param errorCode 에러 코드
     * @param message 에러 메시지
     */
    public SystemException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    /**
     * 에러 코드와 메시지, 그리고 원인 예외로 SystemException을 생성합니다.
     *
     * @param errorCode 에러 코드
     * @param message 에러 메시지
     * @param cause 원인 예외
     */
    public SystemException(String errorCode, String message, Throwable cause) {
        super(message, cause);
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