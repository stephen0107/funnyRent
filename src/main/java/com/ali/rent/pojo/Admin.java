package com.ali.rent.pojo;

import javax.persistence.*;

@Table(name = "admin")
public class Admin {
    @Id
    private Integer id;

    private String username;

    private String password;

    /**
     * 默认1，表示管理员，0表示被删除
     */
    private Integer flag;

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
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取默认1，表示管理员，0表示被删除
     *
     * @return flag - 默认1，表示管理员，0表示被删除
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置默认1，表示管理员，0表示被删除
     *
     * @param flag 默认1，表示管理员，0表示被删除
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}