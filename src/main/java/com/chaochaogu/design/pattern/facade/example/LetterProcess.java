package com.chaochaogu.design.pattern.facade.example;

/**
 * 写信过程实现
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class LetterProcess implements ILetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("写信内容：" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("收件地址：" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放入信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("开始寄信");
    }
}
