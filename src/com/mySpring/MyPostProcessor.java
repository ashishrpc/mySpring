package com.mySpring;



import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
  
public class MyPostProcessor implements BeanPostProcessor
{ 
    @Override
    public Object postProcessAfterInitialization(Object beanObj, String beanName) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("post Process After Initialization......"+beanName);
        return beanObj;
    }

    @Override
    public Object postProcessBeforeInitialization(Object beanObj, String beanName) throws BeansException {
        // TODO Auto-generated method stub
        System.out.println("post Process Before Initialization......"+beanName);
        return beanObj;
    } 
}