package com.hecy.dubboconsumber;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class DubboConsumberLauncher {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumberLauncher.class, args);
    }
}
