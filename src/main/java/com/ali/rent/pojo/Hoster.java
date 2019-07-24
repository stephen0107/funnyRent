package com.ali.rent.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hoster")
public class Hoster {
    @Id
    private Integer id;

    /**
     * 外键，指向市级地址，代表该经纪人在该市卖房
     */
    @Column(name = "city_id")
    private Integer cityId;

    private String username;

    private String password;

    private String phone;

    private String email;

    private String sex;

    /**
     * 身份证号码
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 头像地址
     */
    private String portrait;

    /**
     * 主营板块
     */
    @Column(name = "business_area")
    private String businessArea;

    /**
     * 能力标签
     */
    private String capacity;

    /**
     * 注册时间
     */
    @Column(name = "registration_time")
    private Date registrationTime;

    /**
     * 默认2，表示卖家，0表示被删除
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
     * 获取外键，指向市级地址，代表该经纪人在该市卖房
     *
     * @return city_id - 外键，指向市级地址，代表该经纪人在该市卖房
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * 设置外键，指向市级地址，代表该经纪人在该市卖房
     *
     * @param cityId 外键，指向市级地址，代表该经纪人在该市卖房
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
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
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * 获取身份证号码
     *
     * @return id_card - 身份证号码
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证号码
     *
     * @param idCard 身份证号码
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * 获取头像地址
     *
     * @return portrait - 头像地址
     */
    public String getPortrait() {
        return portrait;
    }

    /**
     * 设置头像地址
     *
     * @param portrait 头像地址
     */
    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    /**
     * 获取主营板块
     *
     * @return business_area - 主营板块
     */
    public String getBusinessArea() {
        return businessArea;
    }

    /**
     * 设置主营板块
     *
     * @param businessArea 主营板块
     */
    public void setBusinessArea(String businessArea) {
        this.businessArea = businessArea == null ? null : businessArea.trim();
    }

    /**
     * 获取能力标签
     *
     * @return capacity - 能力标签
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * 设置能力标签
     *
     * @param capacity 能力标签
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity == null ? null : capacity.trim();
    }

    /**
     * 获取注册时间
     *
     * @return registration_time - 注册时间
     */
    public Date getRegistrationTime() {
        return registrationTime;
    }

    /**
     * 设置注册时间
     *
     * @param registrationTime 注册时间
     */
    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * 获取默认2，表示卖家，0表示被删除
     *
     * @return flag - 默认2，表示卖家，0表示被删除
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置默认2，表示卖家，0表示被删除
     *
     * @param flag 默认2，表示卖家，0表示被删除
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Hoster{" +
                "id=" + id +
                ", cityId=" + cityId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", idCard='" + idCard + '\'' +
                ", portrait='" + portrait + '\'' +
                ", businessArea='" + businessArea + '\'' +
                ", capacity='" + capacity + '\'' +
                ", registrationTime=" + registrationTime +
                ", flag=" + flag +
                '}';
    }
}