package com.chaochaogu.design.pattern.state.example.pattern;

/**
 * 电梯停止
 *
 * @author chaochao Gu
 * @date 2020/9/15
 */
public class StoppingState extends LiftState {

    /**
     * 电梯停止状态，开门
     */
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }

    /**
     * 停止状态下，电梯门本来就是关闭的
     */
    @Override
    public void close() {
        // do nothing
    }

    /**
     * 停止状态再运行起来
     */
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止 ...");
    }
}
