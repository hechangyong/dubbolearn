package com.hecy.dubboprovider.provider;

   import com.hecy.dubbocommon.SayHello;
  import org.apache.dubbo.rpc.RpcContext;
   import org.springframework.stereotype.Service;

/**
 * @Author: hecy
 * @Date: 2019/9/2 15:25
 * @Version 1.0
 */
@Service("demoService")
public class SayHelloImpl implements SayHello {

    public String sayHello(String name) {
        return "hello" + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }


}
