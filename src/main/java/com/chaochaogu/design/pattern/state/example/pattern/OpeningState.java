package com.chaochaogu.design.pattern.state.example.pattern;

/**
 * 敞门状态
 *
 * @author chaochao Gu
 * @date 2020/9/15
 */
public class OpeningState extends LiftState {

    @Override
    public void open() {
        System.out.println("电梯门开启 ...");
    }

    @Override
    public void close() {
        // 状态修改
        super.context.setLiftState(Context.CLOSING_STATE);
        // 动作委托给ClosingState来执行
        super.context.getLiftState().close();
    }

    @Override
    public void run() {
        // do nothing
    }

    @Override
    public void stop() {
        // do nothing
    }
}
