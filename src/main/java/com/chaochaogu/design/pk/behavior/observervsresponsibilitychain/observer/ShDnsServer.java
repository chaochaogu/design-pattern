package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.observer;

import com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain.Recorder;

/**
 * 上海DNS服务器
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class ShDnsServer extends DnsServer {

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".sh.cn");
    }

    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("上海DNS服务器");
    }
}
