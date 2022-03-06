package com.kodilla.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.logging.Logger;

public class BeanMonitor implements BeanPostProcessor {

    private static Logger log = Logger.getLogger("InfoLogging");

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws
            BeansException {

        System.out.println("Before initialization of bean: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("After initialziation of bean: " + beanName);
        log.info("Bean " + beanName + " has been initialized.");
        return bean;
    }
}
