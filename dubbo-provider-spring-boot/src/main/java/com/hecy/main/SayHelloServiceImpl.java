package com.hecy.main;

import com.alibaba.dubbo.config.annotation.Service;
import com.hecy.dubbocommon.SayHello;
import org.springframework.stereotype.Component;

/**
 * @Author: hecy
 * @Date: 2019/9/6 14:42
 * @Version 1.0
 */
@Service(interfaceName ="com.hecy.dubbocommon.SayHello")
@Component
public class SayHelloServiceImpl  implements SayHello {
    @Override
    public String sayHello(String name) {
        return name + ": Say Hello To You";
    }
}
