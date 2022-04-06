import com.springmy.BeanDefinition;
import com.springmy.BeanDefinitionRegistException;
import com.springmy.DefaultBeanFactory;
import com.springmy.GenericBeanDefinition;
import com.springmy.testbean.ABean;
import com.springmy.testbean.ABeanFactory;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chao.zhang
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DefaultBeanFactoryTest {
    static DefaultBeanFactory bf = new DefaultBeanFactory();

    //测试构造方法方式创建bean实例
    @Test
    public void get() throws Exception {
        //创建bean定义
        GenericBeanDefinition bd = new GenericBeanDefinition();
        bd.setBeanClass(ABean.class);
        bd.setScope(BeanDefinition.SCOPE_SINGLETION);
        //设置bean的初始化方法
        bd.setInitMethodName("init");
        //设置bean的销毁方法
        bd.setDestroyMethodName("destroy");

        //把bean定义注册到bean工厂DefaultBeanFactory bf
        bf.registerBeanDefinition("aBean", bd);

        System.out.println("构造方法方式------------");
        for (int i = 0; i < 3; i++) {
            ABean ab = (ABean) bf.getBean("aBean");
            ab.doSomthing();
        }
    }


    //静态工厂方法的方式创建bean实例
    @Test
    public void testRegistStaticFactoryMethod() throws Exception {
        //创建bean定义
        GenericBeanDefinition bd = new GenericBeanDefinition();
        //设置工厂bean的名字
        bd.setBeanClass(ABeanFactory.class);
        //设置工厂方法名
        bd.setFactoryMethodName("getABean");
        //把bean定义注册到bean工厂DefaultBeanFactory bf
        bf.registerBeanDefinition("staticAbean", bd);

        System.out.println("静态工厂方法方式------------");
        for (int i = 0; i < 3; i++) {
            ABean ab = (ABean) bf.getBean("staticAbean");
            ab.doSomthing();
        }
    }

    //工厂bean的方式创建bean实例
    @Test
    public void testRegistFactoryMethod() throws Exception {
        //创建工厂bean定义
        GenericBeanDefinition bd = new GenericBeanDefinition();
        //设置工厂bean的名字
        bd.setBeanClass(ABeanFactory.class);
        String fbname = "factory";
        //把工厂bean注册到bean工厂DefaultBeanFactory bf
        bf.registerBeanDefinition(fbname, bd);

        //创建bean定义
        bd = new GenericBeanDefinition();
        //设置工厂bean的名字
        bd.setFactoryBeanName(fbname);
        //设置工厂bean的方法名
        bd.setFactoryMethodName("getABean2");
        //设置是否是单列
        bd.setScope(BeanDefinition.SCOPE_SINGLETION);

        //把bean定义注册到bean工厂DefaultBeanFactory bf
        bf.registerBeanDefinition("factoryAbean", bd);

        System.out.println("工厂方法方式------------");
        for (int i = 0; i < 3; i++) {
            ABean ab = (ABean) bf.getBean("factoryAbean");
            ab.doSomthing();
        }
    }

    //获取bean实例并调用里面的方法
    @AfterClass
    public static void testGetBean() throws Exception {
        System.out.println("销毁------------");
        //销毁
        bf.close();
    }


}
