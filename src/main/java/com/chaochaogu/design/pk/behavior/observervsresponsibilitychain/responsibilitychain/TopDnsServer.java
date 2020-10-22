package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain;

/**
 * 全球顶级DNS服务器
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class TopDnsServer extends DnsServer {

    @Override
    protected Recorder echo(String domain) {
        Recorder recorder = super.echo(domain);
        recorder.setOwner("全球顶级DNS服务器");
        return recorder;
    }

    @Override
    protected boolean isLocal(String domain) {
        // 所有域名最终的解析起点
        return true;
    }
}
