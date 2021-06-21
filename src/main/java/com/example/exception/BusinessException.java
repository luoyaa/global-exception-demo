package com.example.exception;

import lombok.Data;

/**
 * 代码中code和message常量实际项目中使用枚举或常量类定义的
 *
 * @author luoyaa
 * @date 2021-06-21 17:45
 */
@Data
class BusinessException extends RuntimeException {
    private int code;
    private String message;
    private Object data;

    public BusinessException() {
        this.code = 500;
        this.message = "failure";
    }

    public BusinessException(String message) {
        this();
        this.message = message;
    }
}
