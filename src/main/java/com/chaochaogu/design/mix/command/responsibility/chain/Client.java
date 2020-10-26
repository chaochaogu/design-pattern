package com.chaochaogu.design.mix.command.responsibility.chain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        while (true) {
            //UNIX下的默认提示符号
            System.out.print("#");
            //捕获输出
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            //输入quit或exit则退出
            if ("quit".equals(input) || "exit".equals(input)) {
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }
}
