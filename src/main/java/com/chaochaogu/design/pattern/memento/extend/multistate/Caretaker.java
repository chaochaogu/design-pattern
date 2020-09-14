package com.chaochaogu.design.pattern.memento.extend.multistate;

import lombok.Data;

/**
 * 备忘录管理员
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
@Data
public class Caretaker {

    /**
     * 备忘录，setter、getter通过Lombok生成
     */
    private Memento memento;
}
