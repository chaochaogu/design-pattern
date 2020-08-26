package com.chaochaogu.design.lsp;

/**
 * AUG狙击步枪
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class AUG extends Rifle {

    public void zoomOut(){
        System.out.println("战术观察，瞄准 ...");
    }

    @Override
    public void shoot() {
        System.out.println("AUG狙击步枪，精准狙击 ...");
    }
}
