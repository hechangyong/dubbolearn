package com.hecy.dubboconsumber.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: hecy
 * @Date: 2019/9/3 14:21
 * @Version 1.0
 */
@Configuration
@ImportResource({"classpath:dubbo-consumber.xml"})
public class PropertiesConfig {
}
