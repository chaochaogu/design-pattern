package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.observer;

import com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain.Recorder;
import com.google.common.base.Joiner;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * 抽象DNS服务器
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public abstract class DnsServer extends Observable implements Observer {

    /**
     * 处理请求，也就是接收到事件后的处理
     *
     * @param arg0
     * @param arg1
     */
    @Override
    public void update(Observable arg0, Object arg1) {
        Recorder recorder = (Recorder) arg1;
        // 如果本机能解析
        if (isLocal(recorder)) {
            recorder.setIp(getIpAddress());
        } else {
            // 本机不能解析，则提交到上级DNS
            responseFromUpperServer(recorder);
        }
        // 签名
        sign(recorder);
    }

    /**
     * 作为被观察者，允许增加观察者，这里上级DNS一般只有一个
     *
     * @param dnsServer
     */
    public void setUpperServer(DnsServer dnsServer) {
        // 先清空，然后再增加
        super.deleteObservers();
        super.addObserver(dnsServer);
    }

    /**
     * 向父DNS请求解析，也就是通知观察者
     *
     * @param recorder
     */
    private void responseFromUpperServer(Recorder recorder) {
        super.setChanged();
        super.notifyObservers(recorder);
    }

    /**
     * 每个DNS服务器都必须定义自己的处理级别
     *
     * @param recorder
     * @return
     */
    protected abstract boolean isLocal(Recorder recorder);

    /**
     * 每个DNS服务器签上自己的名字
     *
     * @param recorder
     * @return
     */
    protected abstract void sign(Recorder recorder);

    /**
     * 随机产生一个ip地址，工具类
     *
     * @return
     */
    private String getIpAddress() {
        Random random = new Random();
        return Joiner.on(".").join(
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255));
    }
}
