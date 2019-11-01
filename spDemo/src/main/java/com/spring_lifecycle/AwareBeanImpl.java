package com.spring_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class AwareBeanImpl implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("AwareBeanImpl的setBeanFactory方法被调用了");
        System.out.println("setBeanFactory是否单例： " + beanFactory.isSingleton("awareBean"));
    }
    @Override
    public void setBeanName(String beanName) {
        System.out.println("setBeanName被调用了");
        System.out.println("setBeanName Bean定义在context中名称为 = " + beanName);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext方法被调用了");
        System.out.println("setApplicationContext:: Bean 定义为 Name =  "
                + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }
}
