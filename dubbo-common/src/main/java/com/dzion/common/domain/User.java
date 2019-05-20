package com.dzion.common.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName User
 * @Author Rao Shiqi
 * @Date 2019/5/17 11:44
 * @Description TODO
 */
@Data
public class User implements Serializable {
    private String name;

    public User name(String name) {
        this.name = name;
        return this;
    }
}
