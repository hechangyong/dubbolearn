package com.hecy.dubboprovider.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: hecy
 * @Date: 2019/9/3 14:21
 * @Version 1.0
 */
@Configuration
@ImportResource({"classpath:dubbo-provider.xml"})
public class PropertiesConfig {
}
