package com.chaochaogu.design.pattern.state.example.normal;

import static com.chaochaogu.design.pattern.state.example.normal.ILift.STOPPING_STATE;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/15
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        // 电梯初始为停止状态
        lift.setState(STOPPING_STATE);
        // 电梯门开启，人进去
        lift.open();
        // 电梯门关闭
        lift.close();
        // 电梯上下运行起来
        lift.run();
        // 到达目的地，电梯停止
        lift.stop();
    }
}
