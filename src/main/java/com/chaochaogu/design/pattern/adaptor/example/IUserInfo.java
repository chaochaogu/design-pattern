package com.chaochaogu.design.pattern.adaptor.example;

/**
 * 员工信息接口
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public interface IUserInfo {

    /**
     * 获得用户姓名
     *
     * @return
     */
    public String getUsername();

    /**
     * 获得家庭地址
     *
     * @return
     */
    public String getHomeAddress();

    /**
     * 获得手机号
     *
     * @return
     */
    public String getMobileNumber();

    /**
     * 获得办公电话
     *
     * @return
     */
    public String getOfficeTelNumber();

    /**
     * 获得职位
     *
     * @return
     */
    public String getJobPosition();

    /**
     * 获得家庭电话
     *
     * @return
     */
    public String getHomeTelNumber();
}
