package com.example;

import lombok.*;

/**
 * @author luoyaa
 * @date 2021-06-21 17:39
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ResultJson {

    private int code;
    private String message;
    private Object data;

    public static ResultJson success() {
        return new ResultJson(200, "success", null);
    }

    public static ResultJson success(Object data) {
        return new ResultJson(200, "success", data);
    }

    public static ResultJson failure() {
        return new ResultJson(400, "failure", null);
    }

    public static ResultJson failure(int code, String message, Object data) {
        return new ResultJson(code, message, data);
    }
}
