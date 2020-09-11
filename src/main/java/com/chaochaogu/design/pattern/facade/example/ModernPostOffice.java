package com.chaochaogu.design.pattern.facade.example;

/**
 * 扩展后的现代邮局
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class ModernPostOffice {
    private ILetterProcess letterProcess = new LetterProcess();
    private Police police = new Police();

    /**
     * 写信，封装，投递，一体化了
     *
     * @param context
     * @param address
     */
    public void sendLetter(String context, String address) {
        // 帮你写信
        letterProcess.writeContext(context);
        // 写好信封
        letterProcess.fillEnvelope(address);
        // 警察检查信件
        police.checkLetter(letterProcess);
        // 把信件放入信封
        letterProcess.letterIntoEnvelope();
        // 邮递信件
        letterProcess.sendLetter();
    }
}
