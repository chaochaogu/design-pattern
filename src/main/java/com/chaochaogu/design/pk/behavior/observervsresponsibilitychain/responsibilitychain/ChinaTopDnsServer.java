package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain;

/**
 * 中国顶级DNS服务器
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class ChinaTopDnsServer extends DnsServer {

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("中国顶级DNS服务器");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".cn");
    }
}
