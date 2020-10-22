package com.chaochaogu.design.pk.cross.facadevsmediator.mediator;

/**
 * 税收
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Tax extends AbsColleague implements ITax {

    public Tax(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void raise() {
        super.mediator.up(this);
    }

    @Override
    public void drop() {
        super.mediator.down(this);
    }
}
