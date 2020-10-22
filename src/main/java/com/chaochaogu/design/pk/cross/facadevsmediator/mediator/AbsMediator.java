package com.chaochaogu.design.pk.cross.facadevsmediator.mediator;

/**
 * 抽象中介者
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public abstract class AbsMediator {

    /**
     * 工资
     */
    protected final ISalary salary;

    /**
     * 职位
     */
    protected final IPosition position;

    /**
     * 税收
     */
    protected final ITax tax;

    public AbsMediator() {
        this.salary = new Salary(this);
        this.position = new Position(this);
        this.tax = new Tax(this);
    }

    /**
     * 工资增加
     *
     * @param salary
     */
    public abstract void up(ISalary salary);

    /**
     * 职位上升
     *
     * @param position
     */
    public abstract void up(IPosition position);

    /**
     * 税收增加
     *
     * @param tax
     */
    public abstract void up(ITax tax);

    /**
     * 工资减少
     *
     * @param salary
     */
    public abstract void down(ISalary salary);

    /**
     * 职位降低
     *
     * @param position
     */
    public abstract void down(IPosition position);

    /**
     * 税收下降
     *
     * @param tax
     */
    public abstract void down(ITax tax);
}
