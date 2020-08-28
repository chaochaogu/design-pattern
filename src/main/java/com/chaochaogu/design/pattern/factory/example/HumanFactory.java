package com.chaochaogu.design.pattern.factory.example;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
