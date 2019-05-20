package com.dzion.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName R
 * @Author Rao Shiqi
 * @Date 2019/5/17 15:25
 * @Description TODO
 */
@Data
public class R<T> implements Serializable {
    private int code;
    private String msg;
    private T data;


    public static <T> R<T> ok(T data) {
        R<T> ret = new R<>();
        ret.setCode(0);
        ret.setData(data);
        ret.setMsg("success");
        return ret;
    }

    public static <T> R<T> failed(T data) {
        R<T> ret = new R<>();
        ret.setCode(-1);
        ret.setData(data);
        ret.setMsg("failed");
        return ret;
    }


}
