package com.example.project.common.constants;

/**
 * 에러 코드 관련 상수 정의
 * <p>
 * 시스템에서 발생할 수 있는 다양한 에러 상황에 대한 코드를 정의합니다.
 * 시스템 에러, SQL 에러, 파일 에러 등 다양한 에러 코드가 포함됩니다.
 * </p>
 *
 * @author Spring Boot Converter
 * @version 1.0
 * @since 2024-03-26
 */
public final class ErrorCodeConstants {

    private ErrorCodeConstants() {
        throw new UnsupportedOperationException("Utility class");
    }

    /** 시스템 에러 */
    public static final int SYSTEM_ERROR = -1;

    /** 파라미터 에러 */
    public static final int PARAMETER_ERROR = -2;

    /** SQL 에러 */
    public static final int SQL_ERROR = -3;

    /** 메모리 할당 에러 */
    public static final int MEMORY_ERROR = -4;

    /** 파일 에러 */
    public static final int FILE_ERROR = -5;

    /** 타임아웃 에러 */
    public static final int TIMEOUT_ERROR = -6;

    /** 오버플로우 에러 */
    public static final int OVERFLOW_ERROR = -7;

    /** 데이터 없음 */
    public static final int NO_DATA_ERROR = -8;

    /** 중복 에러 */
    public static final int DUPLICATE_ERROR = -9;

    /** 범위 에러 */
    public static final int RANGE_ERROR = -10;

    /** 처리 스킵 */
    public static final int SKIP_PROCESSING = 100;
}