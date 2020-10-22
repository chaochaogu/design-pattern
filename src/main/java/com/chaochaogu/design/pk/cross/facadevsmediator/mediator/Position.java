package com.chaochaogu.design.pk.cross.facadevsmediator.mediator;

/**
 * 职位
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Position extends AbsColleague implements IPosition {

    public Position(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void promote() {
        super.mediator.up(this);
    }

    @Override
    public void demote() {
        super.mediator.down(this);
    }
}
