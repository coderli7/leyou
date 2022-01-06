package com.leyou.item;/**
 * Description:
 *
 * @author lxl
 * @date ${date} ${time}
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * ClassName LyItemService
 *
 * @Author bruce
 * @Date 2021/8/19  17:30
 * Version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.leyou.item.mapper")
public class LyItemService {

    public static void main(String[] args) {
        SpringApplication.run(LyItemService.class, args);
        System.out.println("item服务已启动！");

    }

}
