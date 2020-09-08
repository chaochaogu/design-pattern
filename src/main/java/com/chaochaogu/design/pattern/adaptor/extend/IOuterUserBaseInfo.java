package com.chaochaogu.design.pattern.adaptor.extend;

import java.util.Map;

/**
 * 用户基本信息接口
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public interface IOuterUserBaseInfo {

    /**
     * 基本信息，比如名称、性别、手机号码等
     *
     * @return
     */
    public Map getUserBaseInfo();
}
