package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.observer;

import com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain.Recorder;

/**
 * 中国顶级DNS服务器
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class ChinaTopDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("中国顶级DNS服务器");
    }
}
