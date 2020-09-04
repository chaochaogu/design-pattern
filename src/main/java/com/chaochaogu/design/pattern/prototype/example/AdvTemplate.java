package com.chaochaogu.design.pattern.prototype.example;

import lombok.Data;

/**
 * 广告信模板
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
@Data
public class AdvTemplate {

    /**
     * 广告信主题
     */
    private String advSubject = "XX银行国庆信用卡抽奖活动";

    /**
     * 广告信内容
     */
    private String advContext = "国庆抽奖活动通知：只要刷卡就送你一百万！...";
}
