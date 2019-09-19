package com.lc.model;

import javax.persistence.*;

public class User {
    @Id
    private Integer id;

    /**
     * 账号
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取账号
     *
     * @return name - 账号
     */
    public String getName() {
        return name;
    }

    /**
     * 设置账号
     *
     * @param name 账号
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}