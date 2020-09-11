package com.chaochaogu.design.pattern.facade.example;

/**
 * 信件检查类
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Police {

    /**
     * 检查信件，检查完毕后警察在信封上盖个戳：此信无病毒
     *
     * @param letterProcess
     */
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println("信件 " + letterProcess + " 已经通过检查");
    }
}
