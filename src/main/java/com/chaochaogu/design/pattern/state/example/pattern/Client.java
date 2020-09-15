package com.chaochaogu.design.pattern.state.example.pattern;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/15
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.STOPPING_STATE);
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
