package com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.observer;

import com.chaochaogu.design.pk.behavior.observervsresponsibilitychain.responsibilitychain.Recorder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class Client {
    public static void main(String[] args) throws IOException {
        // 上海域名服务器
        DnsServer sh = new ShDnsServer();
        // 中国顶级域名服务器
        DnsServer china = new ChinaTopDnsServer();
        // 全球顶级域名服务器
        DnsServer top = new TopDnsServer();
        // 定义查询路径
        sh.setUpperServer(china);
        china.setUpperServer(top);
        // 解析域名
        System.out.println("=====域名解析模拟器=====");
        while (true) {
            System.out.print("\n请输入域名(输入N退出):");
            String domain = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            if ("n".equalsIgnoreCase(domain)) {
                return;
            }
            Recorder recorder = new Recorder();
            recorder.setDomain(domain);
            sh.update(null, recorder);
            System.out.println("----DNS服务器解析结果----");
            System.out.println(recorder);
        }

    }
}
