package com.hecy.dubboconsumber;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hecy.dubbocommon.SayHello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hecy
 * @Date: 2019/9/6 15:19
 * @Version 1.0
 */
@RestController
@RequestMapping("/a")
public class SayHelloConsumberImpl {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private SayHello sayHello;

    @GetMapping("/b")
    public String sayhello(){
         return sayHello.sayHello("小可爱");
    }

}
