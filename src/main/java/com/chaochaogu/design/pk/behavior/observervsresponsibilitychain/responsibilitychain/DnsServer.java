package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain;

import com.google.common.base.Joiner;

import java.util.Random;

/**
 * 抽象域名服务器
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public abstract class DnsServer {

    /**
     * 上级DNS是谁
     */
    protected DnsServer upperServer;

    /**
     * 指向上级DNS
     *
     * @param upperServer
     */
    public void setUpperServer(DnsServer upperServer) {
        this.upperServer = upperServer;
    }

    /**
     * 解析域名
     *
     * @param domain
     * @return
     */
    public final Recorder resolve(String domain) {
        Recorder recorder;
        if (isLocal(domain)) {
            recorder = echo(domain);
        } else {
            recorder = upperServer.resolve(domain);
        }
        return recorder;
    }

    /**
     * 每个DNS都有一个数据处理区（ZONE），检查域名是否在本区中
     *
     * @param domain
     * @return
     */
    protected abstract boolean isLocal(String domain);

    /**
     * 每个DNS服务器都必须实现解析任务
     *
     * @param domain
     * @return
     */
    protected Recorder echo(String domain) {
        Recorder recorder = new Recorder();
        recorder.setDomain(domain);
        recorder.setIp(getIpAddress(domain));
        return recorder;
    }

    /**
     * 随机产生一个ip地址，工具类
     *
     * @param domain
     * @return
     */
    private String getIpAddress(String domain) {
        Random random = new Random();
        return Joiner.on(".").join(
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255));
    }
}
