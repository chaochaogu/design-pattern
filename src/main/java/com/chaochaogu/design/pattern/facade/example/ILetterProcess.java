package com.chaochaogu.design.pattern.facade.example;

/**
 * 写信过程接口
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public interface ILetterProcess {

    /**
     * 写信内容
     *
     * @param context
     */
    public void writeContext(String context);

    /**
     * 补充收件地址
     *
     * @param address
     */
    public void fillEnvelope(String address);

    /**
     * 把信件放入信封
     */
    public void letterIntoEnvelope();

    /**
     * 寄信
     */
    public void sendLetter();
}
