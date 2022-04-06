package com.springmy;

/**
 * https://www.cnblogs.com/leeSmall/p/10023593.html
 * 说明：bean定义BeanDefinition通过bean定义注册接口BeanDefinitionRegistry注册到Bean工厂BeanFactory，Bean工厂BeanFactory负责创建bean
 * @author chao.zhang
 */
public interface BeanDefinitionRegistry {
    //注册bean定义
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws BeanDefinitionRegistException;

    //获取bean定义
    BeanDefinition getBeanDefinition(String beanName);

    //判断是否包含bean定义
    boolean containsBeanDefinition(String beanName);
}
