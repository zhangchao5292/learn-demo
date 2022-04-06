package com.springmy.proxy;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.SpringProxy;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.AopUtils;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author chao.zhang
 */
public class ProxyFactoryTest {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new PersonClass());
        proxyFactory.addAdvice((MethodBeforeAdvice) (method, args1, target) ->
                System.out.println("你被拦截了：方法名为：" + method.getName() + " 参数为--" + Arrays.asList(args1)));

        PersonInterface proxy = (PersonInterface) proxyFactory.getProxy();
        proxy.sayHello();
        // 获取类型，看看是JDK代理还是cglib的
        System.out.println(proxy instanceof Proxy); //true  所有的JDK代理都是继承自Proxy的
        System.out.println(proxy instanceof SpringProxy); //true
        System.out.println(proxy.getClass()); //class com.fsx.maintest.$Proxy0
        System.out.println(AopUtils.isCglibProxy(proxy)); //false
        //测试Advised接口、DecoratingProxy的内容
        Advised advised = (Advised) proxy;
        System.out.println(Arrays.asList(advised.getProxiedInterfaces())); //[interface com.fsx.maintest.DemoInterface]
        System.out.println(Arrays.asList(advised.getAdvisors())); //[org.springframework.aop.support.DefaultPointcutAdvisor: pointcut [Pointcut.TRUE]; advice [com.fsx.maintest.Main$$Lambda$2/1349414238@2ef5e5e3]]
        System.out.println(advised.isExposeProxy()); //false
        System.out.println(advised.isFrozen()); //false

        // Object的方法 ==== 所有的Object方法都不会被AOP代理 这点需要注意
        System.out.println(proxy.equals(new Object()));
        System.out.println(proxy.hashCode());
        System.out.println(proxy.getClass());

        // 其余方法都没被拦截  只有toString()被拦截了  咋回事呢？它也不符合切点表达式的要求啊  看下面的解释吧
        // 你被拦截了：方法名为：hello 参数为--[]
        // com.fsx.maintest.Demo@643b1d11
        System.out.println(proxy.toString());


    }
}
