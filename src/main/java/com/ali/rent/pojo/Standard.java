package com.ali.rent.pojo;

import javax.persistence.*;

@Table(name = "standard")
public class Standard {
    /**
     * 标准索引
     */
    @Id
    @Column(name = "s_id")
    private Integer sId;

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
     * 步数
     */
    private Long exercise;

    /**
     * 卡路里
     */
    private Long calorie;

    /**
     * 标准
     */
    private String standard;

    /**
     * 对应的推送建议
     */
    @Column(name = "p_id")
    private Integer pId;

    /**
     * 获取标准索引
     *
     * @return s_id - 标准索引
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * 设置标准索引
     *
     * @param sId 标准索引
     */
    public void setsId(Integer sId) {
        this.sId = sId;
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
     * 获取步数
     *
     * @return exercise - 步数
     */
    public Long getExercise() {
        return exercise;
    }

    /**
     * 设置步数
     *
     * @param exercise 步数
     */
    public void setExercise(Long exercise) {
        this.exercise = exercise;
    }

    /**
     * 获取卡路里
     *
     * @return calorie - 卡路里
     */
    public Long getCalorie() {
        return calorie;
    }

    /**
     * 设置卡路里
     *
     * @param calorie 卡路里
     */
    public void setCalorie(Long calorie) {
        this.calorie = calorie;
    }

    /**
     * 获取标准
     *
     * @return standard - 标准
     */
    public String getStandard() {
        return standard;
    }

    /**
     * 设置标准
     *
     * @param standard 标准
     */
    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    /**
     * 获取对应的推送建议
     *
     * @return p_id - 对应的推送建议
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置对应的推送建议
     *
     * @param pId 对应的推送建议
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }
}