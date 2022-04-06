package com.spring;

import com.entity.Node;
import com.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-30 12:53
 **/
@Configuration
@Component
public class Config {

    @Bean("person")
    public Person person() {
        return new Person();
    }

}
