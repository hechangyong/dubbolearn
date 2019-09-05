package com.hecy.dubboconsumber.consumer;

import com.hecy.dubbocommon.SayHello;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hecy
 * @Date: 2019/9/3 14:26
 * @Version 1.0
 */
@Service("consumerDemoService")
public class ConsumerDemoService {

    @Autowired
    private SayHello demoService;

    public void sayHello(String name) {
        String hello = demoService.sayHello(name); // 执行消费远程方法
        System.out.println(hello); // 显示调用结果
    }

}
