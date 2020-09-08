package com.chaochaogu.design.pattern.adaptor.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户基本信息
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {

    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工电话是...");
        return baseInfoMap;

    }
}
