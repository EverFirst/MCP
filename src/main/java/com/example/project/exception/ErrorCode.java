package com.example.project.exception;

/**
 * 애플리케이션에서 사용되는 에러 코드 상수들을 정의합니다.
 *
 * @author Exception Team
 * @version 1.0
 * @since 2024-01-01
 */
public class ErrorCode {

    /** 검증 오류 관련 코드 */
    public static final String REQUIRED_FIELD_MISSING = "VAL_ERR_001";
    public static final String INVALID_FORMAT = "VAL_ERR_002";
    public static final String INVALID_VALUE = "VAL_ERR_003";

    /** 비즈니스 오류 관련 코드 */
    public static final String DUPLICATE_RESOURCE = "BIZ_ERR_001";
    public static final String RESOURCE_NOT_FOUND = "BIZ_ERR_002";
    public static final String OPERATION_NOT_ALLOWED = "BIZ_ERR_003";

    /** 시스템 오류 관련 코드 */
    public static final String INTERNAL_SERVER_ERROR = "SYS_ERR_001";
    public static final String DATABASE_ERROR = "SYS_ERR_002";
    public static final String EXTERNAL_API_ERROR = "SYS_ERR_003";

    private ErrorCode() {
        throw new IllegalStateException("Utility class");
    }
}