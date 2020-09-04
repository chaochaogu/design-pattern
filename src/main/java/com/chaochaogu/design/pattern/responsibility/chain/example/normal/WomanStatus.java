package com.chaochaogu.design.pattern.responsibility.chain.example.normal;

/**
 * 女性状态
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public enum WomanStatus {

    /**
     * 单身
     */
    SINGLE(0, "单身"),
    MARRIED(1, "已婚"),
    WIDOW(2, "寡妇");

    private int status;
    private String desc;

    WomanStatus(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public int getStatus() {
        return this.status;
    }

    public static WomanStatus fromInt(int status) {
        for (WomanStatus womanStatus : WomanStatus.values()) {
            if (womanStatus.status == status) {
                return womanStatus;
            }
        }
        throw new IllegalArgumentException("unknown status" + status);
    }
}