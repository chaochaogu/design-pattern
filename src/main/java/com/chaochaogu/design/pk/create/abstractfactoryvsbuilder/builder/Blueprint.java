package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.builder;

import lombok.Data;

/**
 * 生产蓝图
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
@Data
public class Blueprint {

    /**
     * 车轮的要求
     */
    private String wheel;

    /**
     * 引擎的要求
     */
    private String engine;
}
