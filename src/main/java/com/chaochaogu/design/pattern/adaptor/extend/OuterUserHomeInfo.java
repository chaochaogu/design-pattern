package com.chaochaogu.design.pattern.adaptor.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户家庭信息
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "员工的家庭电话是...");
        homeInfo.put("homeAddress", "员工的家庭地址是...");
        return homeInfo;

    }
}
