package com.leyou;/**
 * Description:
 *
 * @author lxl
 * @date ${date} ${time}
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ClassName LyGateway
 *
 * @Author bruce
 * @Date 2021/8/16  17:07
 * Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LyGateway {

    public static void main(String[] args) {
        SpringApplication.run(LyGateway.class);
        System.out.println(" 网关启动了！！！");
    }

}
