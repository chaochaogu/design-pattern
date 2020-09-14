package com.chaochaogu.design.pattern.memento.example;

/**
 * 男孩状态类
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Boy {

    /**
     * 男孩的状态
     */
    private String state;

    /**
     * 认识女孩子后状态肯定改变，比如心情、手中的花等
     */
    public void changeState() {
        this.state = "心情可能很不好";
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    /**
     * 保留一个备份
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复一个备份
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.setState(memento.getState());
    }
}
