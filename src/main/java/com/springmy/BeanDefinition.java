package com.springmy;

import org.apache.commons.lang3.StringUtils;

/**
 * @Description: bean定义接口:要IOC容器(bean工厂)创建bean实例，就得告诉IOC容器(bean工厂)需要创建什么样的bean-BeanDefinition
 * @author chao.zhang
 */
public interface BeanDefinition {

    String SCOPE_SINGLETION = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    /**
     * 类:new 构造方法的方式创建bean时，需要告诉bean工厂怎么获取类的名称
     */
    Class<?> getBeanClass();

    /**
     * Scope
     */
    String getScope();

    /**
     * 是否单例
     */
    boolean isSingleton();

    /**
     * 是否原型
     */
    boolean isPrototype();

    /**
     * 工厂bean名：成员工厂方法的方式创建bean时，需要告诉bean工厂怎么获取工厂bean名
     */
    String getFactoryBeanName();

    /**
     * 工厂方法名:静态工厂方法的方式创建bean时，需要告诉bean工厂怎么获取工厂方法名
     */
    String getFactoryMethodName();

    /**
     * 初始化方法
     */
    String getInitMethodName();

    /**
     * 销毁方法
     */
    String getDestroyMethodName();

    /**
     * 校验bean定义的合法性
     */
    default boolean validate() {
        // 没定义class,工厂bean或工厂方法没指定，则不合法。
        if (this.getBeanClass() == null) {
            if (StringUtils.isBlank(getFactoryBeanName()) || StringUtils.isBlank(getFactoryMethodName())) {
                return false;
            }
        }

        // 定义了类，又定义工厂bean，不合法
        if (this.getBeanClass() != null && StringUtils.isNotBlank(getFactoryBeanName())) {
            return false;
        }

        return true;
    }
}
