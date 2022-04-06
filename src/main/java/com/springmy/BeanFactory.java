package com.springmy;

/**
 * IOC容器(bean工厂)接口:负责创建bean实例
 * @author chao.zhang
 */
public interface BeanFactory {
    /**
     * 获取bean
     *
     * @param name bean的名字
     *
     * @return bean 实例
     * @throws Exception
     */
    Object getBean(String name) throws Exception;
}
