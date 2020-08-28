package com.chaochaogu.design.principle.lsp;

/**
 * 战争模拟，里氏替换原则（Liskov Substitution Principle）
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class WarSimulation {
    public static void main(String[] args) {
        System.out.println("第2333次世界大战开始了");
        Solider nb = new Solider();
        System.out.println("普通兵来了");
        nb.setGun(new Rifle());
        System.out.println("装备步枪");
        nb.killEnemy();

        Snipper snipper = new Snipper();
        System.out.println("狙击手来了");
        snipper.setGun(new AUG());
        System.out.println("装备AUG狙击步枪");
        snipper.killEnemy();

        Solider sb = new Solider();
        System.out.println("二货来了");
        sb.setGun(new ToyGun());
        System.out.println("装备玩具枪");
        sb.killEnemy();
    }
}
