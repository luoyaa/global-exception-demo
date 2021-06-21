package com.example.exception;

/**
 * @author luoyaa
 * @date 2021-06-21 17:49
 */
public class ParameterInvalidException extends BusinessException {

    public ParameterInvalidException() {
        super();
    }

    public ParameterInvalidException(String message) {
        super(message);
    }
}