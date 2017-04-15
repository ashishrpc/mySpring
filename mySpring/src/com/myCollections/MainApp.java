package com.myCollections;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.User;
import com.mySpring.BemoBeanTypeTwo;

	public class MainApp {
	   public static void main(String[] args) {
		   //ApplicationContext extends BeanFactory so ApplicationContext is more powerful than BeanFactory (like AOP, Internationalization etc.)
	    ApplicationContext context = new ClassPathXmlApplicationContext("hello.xml");//BeanFactory VS ApplicationContext VS WebApplicationContext  
	      //AbstractApplicationContext  context = new ClassPathXmlApplicationContext("hello.xml");
	      //BeanFactory  bf=new ClassPathXmlApplicationContext("hello.xml");//BeanFactory VS ApplicationContext VS WebApplicationContext  
//	      JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
//
//	      
//	      jc.getAddressList();
//	      jc.getAddressSet();
//	      jc.getAddressMap();
//	      jc.getAddressProp();
	   // BemoBeanTypeTwo objBemo=(BemoBeanTypeTwo)context.getBean("bemoBeanTypeTwo");
	    
	    BTest objBemo=(BTest)context.getBean("bTest");
	    ATest aobj=(ATest)context.getBean("aTest");
	    CTest cobj=(CTest)context.getBean("cTest");
	    
	    
	      //context.registerShutdownHook(); 
	   }
	}