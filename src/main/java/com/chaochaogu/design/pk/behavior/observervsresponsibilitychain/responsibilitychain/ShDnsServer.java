package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain;

/**
 * 上海DNS服务器
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class ShDnsServer extends DnsServer {

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("上海DNS服务器");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        return domain.endsWith(".sh.cn");
    }
}
