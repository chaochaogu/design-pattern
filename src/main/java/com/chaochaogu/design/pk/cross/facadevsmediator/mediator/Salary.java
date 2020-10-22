package com.chaochaogu.design.pk.cross.facadevsmediator.mediator;

/**
 * 工资
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Salary extends AbsColleague implements ISalary {

    public Salary(AbsMediator mediator) {
        super(mediator);
    }

    @Override
    public void increaseSalary() {
        super.mediator.up(this);
    }

    @Override
    public void decreaseSalary() {
        super.mediator.down(this);
    }
}
