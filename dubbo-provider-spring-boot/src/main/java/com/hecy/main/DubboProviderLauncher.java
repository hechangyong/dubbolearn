package com.hecy.main;


import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class DubboProviderLauncher {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderLauncher.class, args);
    }
}
