package com.chaochaogu.design.principle.ocp;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public interface IComputerBook extends IBook {
    /**
     * 计算机书籍有一个范围
     * @return
     */
    String getScope();
}
