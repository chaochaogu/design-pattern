package com.chaochaogu.design.pattern.state.example.pattern;

/**
 * 电梯运行
 *
 * @author chaochao Gu
 * @date 2020/9/15
 */
public class RunningState extends LiftState {

    /**
     * 电梯运行中，不能开门
     */
    @Override
    public void open() {
        // do nothing
    }

    /**
     * 电梯运行中，本来就是关门的
     */
    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯上下运行 ...");
    }

    /**
     * 电梯到达目的地，停止
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
