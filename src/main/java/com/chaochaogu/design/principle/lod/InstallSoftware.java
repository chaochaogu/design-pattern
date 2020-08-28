package com.chaochaogu.design.principle.lod;

/**
 * 迪米特法则（Law of Demeter）
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class InstallSoftware {
    public void installSoftware(Wizard wizard) {
        // 直接调用
        wizard.installWizard();
    }
}
