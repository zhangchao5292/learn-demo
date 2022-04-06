package com.springmy;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 提前实例化单例bean
 *
 * @author chao.zhang
 */
@Slf4j
public class PreBuildBeanFactory extends DefaultBeanFactory {
    private List<String> beanNames = new ArrayList<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition)
            throws BeanDefinitionRegistException {
        super.registerBeanDefinition(beanName, beanDefinition);
        synchronized (beanNames) {
            beanNames.add(beanName);
        }
    }

    public void preInstantiateSingletons() throws Exception {
        synchronized (beanNames) {
            for (String name : beanNames) {
                BeanDefinition bd = this.getBeanDefinition(name);
                if (bd.isSingleton()) {
                    this.doGetBean(name);
                    log.debug("preInstantiate: name=" + name + " " + bd);
                }
            }
        }
    }
}
