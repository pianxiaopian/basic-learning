package com.example.demo1.utils;

import lombok.Data;

@Data
public class JsonResult<T> {
    private T data;
    private String msg;
    private Integer code;

    /**
     * 若没有返回数据时， 默认状态吗为0， 提示信息为 操作成功!
     */
    public JsonResult() {
        this.code = 0;
        this.msg = "操作成功!";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param msg
     * @param code
     */
    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 有数据返回时，状态码为0，默认提示信息为：操作成功！
     * @param data
     */
    public JsonResult(T data) {
        this.data = data;
        this.code = 0;
        this.msg = "操作成功!";
    }

    /**
     * 有数据返回，状态码为0，人为指定提示信息
     * @param data* @param msg
     */
    public JsonResult(T data, String msg) {
        this.data = data;
        this.code = 0;
        this.msg = msg;
    }
}
