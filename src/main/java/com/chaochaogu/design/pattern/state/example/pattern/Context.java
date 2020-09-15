package com.chaochaogu.design.pattern.state.example.pattern;

/**
 * 上下文类
 *
 * @author chaochao Gu
 * @date 2020/9/15
 */
public class Context {

    /**
     * 定义出所有的电梯状态
     */
    public static final OpeningState OPENING_STATE = new OpeningState();
    public static final ClosingState CLOSING_STATE = new ClosingState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StoppingState STOPPING_STATE = new StoppingState();

    /**
     * 定义一个当前电梯状态
     */
    private LiftState liftState;

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        // 把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public LiftState getLiftState() {
        return this.liftState;
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }
}
