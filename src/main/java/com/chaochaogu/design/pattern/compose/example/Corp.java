package com.chaochaogu.design.pattern.compose.example;

/**
 * 抽象公司职员类
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public abstract class Corp {

    /**
     * 名字
     */
    private String name;
    /**
     * 职位
     */
    private String position;
    /**
     * 薪水
     */
    private int salary;

    /**
     * 父节点是谁
     */
    private Corp parent = null;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info;
        info = "姓名：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

    /**
     * 设置父节点
     *
     * @param parent
     */
    public void setParent(Corp parent) {
        this.parent = parent;
    }

    /**
     * 得到父节点
     *
     * @return
     */
    public Corp getParent() {
        return this.parent;
    }
}
