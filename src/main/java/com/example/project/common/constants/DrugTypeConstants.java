package com.example.project.common.constants;

/**
 * 약품 유형 관련 상수 정의
 * <p>
 * 다양한 약품 투여 경로를 나타내는 상수들을 정의합니다.
 * 경구약, 주사제, 외용약 등의 약품 유형 코드가 포함됩니다.
 * </p>
 *
 * @author Spring Boot Converter
 * @version 1.0
 * @since 2024-03-26
 */
public final class DrugTypeConstants {

    private DrugTypeConstants() {
        throw new UnsupportedOperationException("Utility class");
    }

    /** 경구약 */
    public static final String ORAL = "O";

    /** 주사제 */
    public static final String INJECTION = "I";

    /** 외용약 */
    public static final String EXTERNAL = "E";
}