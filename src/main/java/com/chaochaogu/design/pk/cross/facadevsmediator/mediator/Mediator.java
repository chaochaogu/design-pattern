package com.chaochaogu.design.pk.cross.facadevsmediator.mediator;

/**
 * 中介者
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Mediator extends AbsMediator {

    /**
     * 加薪
     *
     * @param salary
     */
    @Override
    public void up(ISalary salary) {
        upSalary();
        upTax();
    }

    /**
     * 降职
     *
     * @param position
     */
    @Override
    public void up(IPosition position) {
        upPosition();
        upSalary();
        upTax();
    }

    /**
     * 加税
     *
     * @param tax
     */
    @Override
    public void up(ITax tax) {
        upTax();
        downSalary();
    }

    /**
     * 降薪
     *
     * @param salary
     */
    @Override
    public void down(ISalary salary) {
        downSalary();
        downTax();
    }

    /**
     * 降职
     *
     * @param position
     */
    @Override
    public void down(IPosition position) {
        downPosition();
        downSalary();
        downTax();
    }

    /**
     * 减税
     *
     * @param tax
     */
    @Override
    public void down(ITax tax) {
        downTax();
        upSalary();
    }

    private void upSalary() {
        System.out.println("工资翻倍，乐翻天");
    }

    private void upTax() {
        System.out.println("税收上升，为国家做贡献");
    }

    private void upPosition() {
        System.out.println("职位上升一级，狂喜");
    }

    private void downSalary() {
        System.out.println("经济不景气，降低工资");
    }

    private void downTax() {
        System.out.println("税收减低，国家收入减少");
    }

    private void downPosition() {
        System.out.println("官降三级，比自杀还痛苦");
    }
}
