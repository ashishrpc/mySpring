package com.mySpring;



import javax.servlet.ServletContext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
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
import org.springframework.web.context.ServletContextAware;
 /*
    setProperty....
    setBeanName()....
    property value before init....SetPropertyValue
    setBeanClassLoader()....
    setBeanFactory()....
    setResourceLoader()....
    setApplicationEventPublisher()....
    setMessageSource()....
    setApplicationContext()....
    post Process Before Initialization......
    InitializingBean -> afterPropertiesSet()......
    init()....
    post Process After Initialization......
    ///Ready to use
    DisposableBean->destroy()....
    destroyCustum()....
  */
public class BemoBeanTypeTwo implements ApplicationContextAware,
        ApplicationEventPublisherAware, BeanClassLoaderAware, BeanFactoryAware,
        BeanNameAware, LoadTimeWeaverAware, MessageSourceAware,
        NotificationPublisherAware, ResourceLoaderAware,InitializingBean, DisposableBean,ServletContextAware
{
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setProperty....");
        this.name = name;
    }

    @Override
    public void setResourceLoader(ResourceLoader arg0) {
        // TODO Auto-generated method stub
    	System.out.println("setResourceLoader()....");
    }
 
    @Override
    public void setNotificationPublisher(NotificationPublisher arg0) {
        // TODO Auto-generated method stub
    	System.out.println("setResourceLoader()....");
 
    }
 
    @Override
    public void setMessageSource(MessageSource arg0) {
        // TODO Auto-generated method stub
    	System.out.println("setMessageSource()....");
    }
 
    @Override
    public void setLoadTimeWeaver(LoadTimeWeaver arg0) {
        // TODO Auto-generated method stub
    	System.out.println("setLoadTimeWeaver()....");
    }
 
    @Override
    public void setBeanName(String arg0) {
        // TODO Auto-generated method stub
    	System.out.println("setBeanName()...."+arg0);
    	System.out.println("property value before init...."+this.name);
    }
 
    @Override
    public void setBeanFactory(BeanFactory arg0) throws BeansException {
        // TODO Auto-generated method stub
    	System.out.println("setBeanFactory()....");
    }
 
    @Override
    public void setBeanClassLoader(ClassLoader arg0) {
        // TODO Auto-generated method stub
    	System.out.println("setBeanClassLoader()....");
    }
 
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
        // TODO Auto-generated method stub
    	System.out.println("setApplicationEventPublisher()....");
    }
 
    @Override
    public void setApplicationContext(ApplicationContext arg0)
            throws BeansException {
        // TODO Auto-generated method stub
    	System.out.println("setApplicationContext()....");
    }
    
    /* (non-Javadoc)
     * @see org.springframework.beans.factory.DisposableBean#destroy()
     */
    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("BemoBeanTypeTwo->DisposableBean->destroy()....");
    }
    
    public void destroyCustum(){
        System.out.println("BemoBeanTypeTwo->destroyCustum()....");
    }
    public void init(){
        System.out.println("BemoBeanTypeTwo->init()....");
    }
    
    /* (non-Javadoc)
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     * interface allows a bean to perform initialization work after all necessary properties on the bean have been set by the container
     */
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("InitializingBean -> afterPropertiesSet()......");
    }

    @Override
    public void setServletContext(ServletContext arg0) {
        // TODO Auto-generated method stub 
        System.out.println("ServletContextAware -> setServletContext(ServletContext arg0)......");
    }

    
}