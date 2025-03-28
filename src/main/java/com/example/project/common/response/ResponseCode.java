package com.example.project.common.response;

/**
 * API 응답 코드 상수를 정의합니다.
 *
 * @author Backend Team
 * @version 1.0
 * @since 2024.01.01
 */
public class ResponseCode {

    /** 성공 응답 코드 */
    public static final String SUCCESS = "SUCCESS";
    
    /** 실패 응답 코드 */
    public static final String FAILURE = "FAILURE";
    
    /** 인증 실패 응답 코드 */
    public static final String UNAUTHORIZED = "UNAUTHORIZED";
    
    /** 접근 권한 없음 응답 코드 */
    public static final String FORBIDDEN = "FORBIDDEN";

    private ResponseCode() {
        throw new IllegalStateException("Utility class");
    }
}