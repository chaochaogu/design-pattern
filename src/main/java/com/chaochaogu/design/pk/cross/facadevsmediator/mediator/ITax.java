package com.chaochaogu.design.pk.cross.facadevsmediator.mediator;

/**
 * 税收接口
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public interface ITax {

    /**
     * 加税
     */
    public void raise();

    /**
     * 减税
     */
    public void drop();
}
