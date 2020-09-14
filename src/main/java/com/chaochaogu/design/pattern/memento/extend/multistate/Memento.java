package com.chaochaogu.design.pattern.memento.extend.multistate;

import lombok.Data;

import java.util.HashMap;

/**
 * 备忘录角色
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
@Data
public class Memento {

    /**
     * 接收hashMap作为状态，setter、getter通过Lombok生成
     */
    private HashMap<String, Object> stateMap;

    /**
     * 接收一个对象，生成一个备份
     *
     * @param stateMap
     */
    public Memento(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
