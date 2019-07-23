package com.ali.rent.pojo;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @param
 */
@Table(name = "room")
public class Room implements Serializable {
    /**
     * 主键
     */
    @Id
    private Integer id;

    /**
     * 外键，链接卖方
     */
    @Column(name = "hoster_id")
    private Integer hosterId;

    /**
     * 外键，对应地址
     */
    @Column(name = "site_dis_id")
    private Integer siteDisId;

    /**
     * 房间名称
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 房间大小，多少平方
     */
    private Integer size;

    /**
     * 房间布局
     */
    private String layout;

    /**
     * 房间介绍
     */
    private String intro;

    /**
     * 房间图片，用json数组
     */
    private String picture;

    /**
     * 房间特点，用json数组
     */
    private String trait;

    /**
     * 租赁方式（整租或合租）
     */
    @Column(name = "lease_pattern")
    private String leasePattern;

    /**
     * 租赁时间
     */
    @Column(name = "lease_time")
    private String leaseTime;

    /**
     * 房间价格
     */
    private Integer price;

    /**
     * 房间状态，0为被删除或审核不通过，1为上线销售中，2为审核中
     */
    private Integer flag;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取外键，链接卖方
     *
     * @return hoster_id - 外键，链接卖方
     */
    public Integer getHosterId() {
        return hosterId;
    }

    /**
     * 设置外键，链接卖方
     *
     * @param hosterId 外键，链接卖方
     */
    public void setHosterId(Integer hosterId) {
        this.hosterId = hosterId;
    }

    /**
     * 获取外键，对应地址
     *
     * @return site_dis_id - 外键，对应地址
     */
    public Integer getSiteDisId() {
        return siteDisId;
    }

    /**
     * 设置外键，对应地址
     *
     * @param siteDisId 外键，对应地址
     */
    public void setSiteDisId(Integer siteDisId) {
        this.siteDisId = siteDisId;
    }

    /**
     * 获取房间名称
     *
     * @return name - 房间名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置房间名称
     *
     * @param name 房间名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取房间大小，多少平方
     *
     * @return size - 房间大小，多少平方
     */
    public Integer getSize() {
        return size;
    }

    /**
     * 设置房间大小，多少平方
     *
     * @param size 房间大小，多少平方
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * 获取房间布局
     *
     * @return layout - 房间布局
     */
    public String getLayout() {
        return layout;
    }

    /**
     * 设置房间布局
     *
     * @param layout 房间布局
     */
    public void setLayout(String layout) {
        this.layout = layout == null ? null : layout.trim();
    }

    /**
     * 获取房间介绍
     *
     * @return intro - 房间介绍
     */
    public String getIntro() {
        return intro;
    }

    /**
     * 设置房间介绍
     *
     * @param intro 房间介绍
     */
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    /**
     * 获取房间图片，用json数组
     *
     * @return picture - 房间图片，用json数组
     */
    public String getPicture() {
        return picture;
    }

    /**
     * 设置房间图片，用json数组
     *
     * @param picture 房间图片，用json数组
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * 获取房间特点，用json数组
     *
     * @return trait - 房间特点，用json数组
     */
    public String getTrait() {
        return trait;
    }

    /**
     * 设置房间特点，用json数组
     *
     * @param trait 房间特点，用json数组
     */
    public void setTrait(String trait) {
        this.trait = trait == null ? null : trait.trim();
    }

    /**
     * 获取租赁方式（整租或合租）
     *
     * @return lease_pattern - 租赁方式（整租或合租）
     */
    public String getLeasePattern() {
        return leasePattern;
    }

    /**
     * 设置租赁方式（整租或合租）
     *
     * @param leasePattern 租赁方式（整租或合租）
     */
    public void setLeasePattern(String leasePattern) {
        this.leasePattern = leasePattern == null ? null : leasePattern.trim();
    }

    /**
     * 获取租赁时间
     *
     * @return lease_time - 租赁时间
     */
    public String getLeaseTime() {
        return leaseTime;
    }

    /**
     * 设置租赁时间
     *
     * @param leaseTime 租赁时间
     */
    public void setLeaseTime(String leaseTime) {
        this.leaseTime = leaseTime == null ? null : leaseTime.trim();
    }

    /**
     * 获取房间价格
     *
     * @return price - 房间价格
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置房间价格
     *
     * @param price 房间价格
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取房间状态，0为被删除或审核不通过，1为上线销售中，2为审核中
     *
     * @return flag - 房间状态，0为被删除或审核不通过，1为上线销售中，2为审核中
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置房间状态，0为被删除或审核不通过，1为上线销售中，2为审核中
     *
     * @param flag 房间状态，0为被删除或审核不通过，1为上线销售中，2为审核中
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}