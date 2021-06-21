package com.example.rest;

import com.example.ResultJson;
import com.example.exception.ParameterInvalidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luoyaa
 * @date 2021-06-21 17:31
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/exception")
    public ResultJson testException() {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new ParameterInvalidException("抛出自定义的参数异常信息");
        }
        return ResultJson.success();
    }
}
