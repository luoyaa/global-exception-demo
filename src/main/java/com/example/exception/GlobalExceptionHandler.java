package com.example.exception;

import com.example.ResultJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author luoyaa
 * @date 2021-06-21 17:59
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 捕获自定义的异常，返回自定义的json格式
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = BusinessException.class)
    public ResultJson customGlobalException(BusinessException e) {
        log.error("自定义异常", e);
        return ResultJson.failure(500, e.getMessage(), null);
    }

    @ExceptionHandler(value = Exception.class)
    public ResultJson otherGlobalException(Exception e) {
        log.error("全局异常", e);
        Throwable cause = e.getCause();
        if (cause instanceof BusinessException) {
            BusinessException businessException = (BusinessException) cause;
            return ResultJson.failure(500, businessException.getMessage(), null);
        }
        return ResultJson.failure(500, e.getMessage(), null);
    }
}
