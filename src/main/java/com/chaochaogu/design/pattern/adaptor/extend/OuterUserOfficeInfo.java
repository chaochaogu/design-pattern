package com.chaochaogu.design.pattern.adaptor.extend;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户工作信息
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "这个人的职位是BOSS...");
        officeInfo.put("officeTelNumber", "员工的办公电话是...");
        return officeInfo;

    }
}
