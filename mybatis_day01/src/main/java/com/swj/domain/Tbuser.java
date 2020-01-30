package com.swj.domain;

import java.security.PrivateKey;

/**
 * @author 孙文举
 * @description
 * @create 2020-01-30 11:45
 */
public class Tbuser {
    private long id;
    private String name;
    private String pwd;

    public Tbuser() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Tbuser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}