package com.leyou;/**
 * Description:
 *
 * @author lxl
 * @date ${date} ${time}
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * ClassName LyRegistry
 *
 * @Author bruce
 * @Date 2021/8/16  16:54
 * Version 1.0
 **/


@SpringBootApplication
@EnableEurekaServer
public class LyRegistry {

    public static void main(String[] args) {
        SpringApplication.run(LyRegistry.class);
        System.out.println("注册中心已启动！！！");
    }
}
