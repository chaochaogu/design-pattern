package com.chaochaogu.design.pattern.adaptor.example;

import java.util.Map;

/**
 * 劳动服务公司的人员信息接口
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public interface IOuterUser {

    /**
     * 基本信息，比如名称、性别、手机号码等
     *
     * @return
     */
    public Map getUserBaseInfo();

    /**
     * 工作区域信息
     *
     * @return
     */
    public Map getUserOfficeInfo();

    /**
     * 用户的家庭信息
     *
     * @return
     */
    public Map getUserHomeInfo();
}
