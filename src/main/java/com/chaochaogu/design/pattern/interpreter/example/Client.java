package com.chaochaogu.design.pattern.interpreter.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 客户模拟类
 *
 * @author chaochao Gu
 * @date 2020/9/17
 */
public class Client {

    /**
     * 进行四则运算
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        // 赋值
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + "=" + calculator.run(var));
    }

    /**
     * 获得值映射
     *
     * @param expStr
     * @return
     * @throws IOException
     */
    private static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        //解析有几个参数要传递
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                //解决重复参数的问题
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + ch + "的值");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

    /**
     * 获得表达式
     *
     * @return
     * @throws IOException
     */
    private static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}
