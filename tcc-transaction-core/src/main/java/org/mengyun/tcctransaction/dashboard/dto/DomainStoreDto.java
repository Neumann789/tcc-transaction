package org.mengyun.tcctransaction.dashboard.dto;

/**
 * @Author huabao.fang
 * @Date 2022/6/14 14:17
 **/
public class DomainStoreDto {

    private String domain;

    // 告警手机号列表,多个以英文逗号分割
    private String phoneNumbers;

    // 告警类型: DING-钉钉, SMS-短信, PHONE-电话
    private String alertType;

    //告警阈值
    private int threshold;

    // 告警间隔时间(单位为分钟) 避免频繁告警
    private int intervalMinutes;

    // 上次告警时间
    private String lastAlertTime;

    // 钉钉机器人地址
    private String dingRobotUrl;

    private String createTime;
    private String lastUpdateTime;
    private long version = 0L;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }

    public int getIntervalMinutes() {
        return intervalMinutes;
    }

    public void setIntervalMinutes(int intervalMinutes) {
        this.intervalMinutes = intervalMinutes;
    }

    public String getDingRobotUrl() {
        return dingRobotUrl;
    }

    public void setDingRobotUrl(String dingRobotUrl) {
        this.dingRobotUrl = dingRobotUrl;
    }

    public String getLastAlertTime() {
        return lastAlertTime;
    }

    public void setLastAlertTime(String lastAlertTime) {
        this.lastAlertTime = lastAlertTime;
    }
}
