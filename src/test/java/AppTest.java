import com.spring.ApplicationContextProvider;
import com.spring.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-30 12:50
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AppTest {

    @Test
    public void test() {
        try {
            Object bean = ApplicationContextProvider.getBean("person");
            System.out.println(bean);
            AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(Config.class);
            String applicationName = ann.getApplicationName();
            System.out.println(applicationName);
            ReentrantLock lock = new ReentrantLock(true);
            Condition condition = lock.newCondition();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
