package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain;

import lombok.Data;

/**
 * 解析记录
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
@Data
public class Recorder {

    /**
     * 域名
     */
    private String domain;

    /**
     * ip地址
     */
    private String ip;

    /**
     * 属主
     */
    private String owner;
}
