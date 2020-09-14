package com.chaochaogu.design.pattern.memento.extend.clone;

/**
 * 使用clone方式的发起人，进行自主备份和恢复
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Originator implements Cloneable {

    /**
     * 内部状态
     */
    private String state;
    /**
     * 备份
     */
    private Originator backup;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    /**
     * 创建一个备忘录
     */
    public void createMemento() {
        this.backup = this.clone();
    }

    /**
     * 恢复一个备忘录
     */
    public void restoreMemento() {
        if (this.backup != null) {
            this.state = this.backup.state;
        }
    }

    /**
     * 克隆当前对象
     *
     * @return
     */
    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
