package com.chaochaogu.design.pattern.adaptor.extend;

import com.chaochaogu.design.pattern.adaptor.example.IUserInfo;

import java.util.Map;

/**
 * 适配器（对象适配器）
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class OuterUserInfo implements IUserInfo {

    /**
     * 源目标对象
     */
    private IOuterUserBaseInfo userBaseInfo;
    private IOuterUserHomeInfo userHomeInfo;
    private IOuterUserOfficeInfo userOfficeInfo;

    /**
     * 数据处理
     */
    private Map baseMap;
    private Map homeMap;
    private Map officeMap;

    /**
     * 构造函数传递对象
     *
     * @param userBaseInfo
     * @param userHomeInfo
     * @param userOfficeInfo
     */
    public OuterUserInfo(IOuterUserBaseInfo userBaseInfo, IOuterUserHomeInfo userHomeInfo, IOuterUserOfficeInfo userOfficeInfo) {
        this.userBaseInfo = userBaseInfo;
        this.userHomeInfo = userHomeInfo;
        this.userOfficeInfo = userOfficeInfo;
        this.baseMap = userBaseInfo.getUserBaseInfo();
        this.homeMap = userHomeInfo.getUserHomeInfo();
        this.officeMap = userOfficeInfo.getUserOfficeInfo();
    }

    /**
     * 家庭地址
     *
     * @return
     */
    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /**
     * 家庭电话号码
     *
     * @return
     */
    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    /**
     * 职位信息
     *
     * @return
     */
    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    /**
     * 手机号码
     *
     * @return
     */
    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /**
     * 办公电话
     *
     * @return
     */
    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    /**
     * 员工的名称
     *
     * @return
     */
    @Override
    public String getUsername() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }
}
