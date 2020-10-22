package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.observer;

import com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain.Recorder;

/**
 * 全球顶级DNS服务器
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class TopDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(Recorder recorder) {
        return true;
    }

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("全球顶级DNS服务器");
    }
}
