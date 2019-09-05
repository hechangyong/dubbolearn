import com.hecy.dubboconsumber.DubboConsumberApplication;
import com.hecy.dubboconsumber.consumer.ConsumerDemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: hecy
 * @Date: 2019/9/3 15:32
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DubboConsumberApplication.class)
public class ConsumerTest {

    @Autowired
    private ConsumerDemoService consumerDemoService;

    @Test
    public void sayHello(){
        consumerDemoService.sayHello("Peng Lei");
    }
}
