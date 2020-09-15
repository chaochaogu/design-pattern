package com.chaochaogu.design.pattern.state.example.pattern;

/**
 * 关门状态
 *
 * @author chaochao Gu
 * @date 2020/9/15
 */
public class ClosingState extends LiftState {

    /**
     * 电梯门关了又打开
     */
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭 ...");
    }

    /**
     * 电梯门关了就运行
     */
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.getLiftState().run();
    }

    /**
     * 电梯门关着，就不按楼层
     */
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.getLiftState().stop();
    }
}
