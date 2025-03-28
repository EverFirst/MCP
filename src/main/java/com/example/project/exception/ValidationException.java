package com.example.project.exception;

/**
 * 유효성 검증에서 발생하는 예외를 처리하기 위한 예외 클래스입니다.
 *
 * @author Exception Team
 * @version 1.0
 * @since 2024-01-01
 */
public class ValidationException extends RuntimeException {

    private final String errorCode;
    private final Object[] args;

    /**
     * 에러 코드와 메시지로 ValidationException을 생성합니다.
     *
     * @param errorCode 에러 코드
     * @param message 에러 메시지
     */
    public ValidationException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.args = new Object[]{};
    }

    /**
     * 에러 코드와 메시지, 그리고 추가 인자들로 ValidationException을 생성합니다.
     *
     * @param errorCode 에러 코드
     * @param message 에러 메시지
     * @param args 메시지 포맷팅을 위한 추가 인자들
     */
    public ValidationException(String errorCode, String message, Object... args) {
        super(message);
        this.errorCode = errorCode;
        this.args = args;
    }

    /**
     * 에러 코드를 반환합니다.
     *
     * @return 에러 코드
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 메시지 포맷팅에 사용되는 인자들을 반환합니다.
     *
     * @return 인자 배열
     */
    public Object[] getArgs() {
        return args;
    }
}