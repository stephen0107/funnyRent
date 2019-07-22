package com.ali.rent.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "bracelet")
public class Bracelet {
    /**
     * 手环编号
     */
    @Id
    @Column(name = "b_id")
    private Integer bId;

    /**
     * 体温
     */
    private Integer temperature;

    /**
     * 心率
     */
    @Column(name = "heart_rate")
    private Integer heartRate;

    /**
     * 地址
     */
    private String adress;

    /**
     * 步数
     */
    private Integer exercise;

    /**
     * 卡路里
     */
    private Integer calorie;

    @Column(name = "create_date")
    private Date createDate;

    /**
     * 状态值
     */
    @Column(name = "b_flag")
    private Integer bFlag;

    /**
     * 获取手环编号
     *
     * @return b_id - 手环编号
     */
    public Integer getbId() {
        return bId;
    }

    /**
     * 设置手环编号
     *
     * @param bId 手环编号
     */
    public void setbId(Integer bId) {
        this.bId = bId;
    }

    /**
     * 获取体温
     *
     * @return temperature - 体温
     */
    public Integer getTemperature() {
        return temperature;
    }

    /**
     * 设置体温
     *
     * @param temperature 体温
     */
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    /**
     * 获取心率
     *
     * @return heart_rate - 心率
     */
    public Integer getHeartRate() {
        return heartRate;
    }

    /**
     * 设置心率
     *
     * @param heartRate 心率
     */
    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * 获取地址
     *
     * @return adress - 地址
     */
    public String getAdress() {
        return adress;
    }

    /**
     * 设置地址
     *
     * @param adress 地址
     */
    public void setAdress(String adress) {
        this.adress = adress == null ? null : adress.trim();
    }

    /**
     * 获取步数
     *
     * @return exercise - 步数
     */
    public Integer getExercise() {
        return exercise;
    }

    /**
     * 设置步数
     *
     * @param exercise 步数
     */
    public void setExercise(Integer exercise) {
        this.exercise = exercise;
    }

    /**
     * 获取卡路里
     *
     * @return calorie - 卡路里
     */
    public Integer getCalorie() {
        return calorie;
    }

    /**
     * 设置卡路里
     *
     * @param calorie 卡路里
     */
    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取状态值
     *
     * @return b_flag - 状态值
     */
    public Integer getbFlag() {
        return bFlag;
    }

    /**
     * 设置状态值
     *
     * @param bFlag 状态值
     */
    public void setbFlag(Integer bFlag) {
        this.bFlag = bFlag;
    }
}