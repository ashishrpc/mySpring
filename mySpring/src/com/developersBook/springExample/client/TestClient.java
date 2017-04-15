package com.developersBook.springExample.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.developersBook.springExample.bean.HelloBean;
import com.developersBook.springExample.domain.Name;

public class TestClient {
	public static void main(String[] args) {
		try {
			System.out.println("TestClient started");

			//Load the hello.xml to classpath
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(
					new String[] { "hello.xml" });

			System.out.println("Classpath loaded");

			HelloBean helloBean = (HelloBean) appContext.getBean("helloBean");

			Name name = new Name();
			name.setFirstName("Tony");
			name.setLastName("Greg");
			String str = helloBean.wishMe(name);

			System.out.println(str);
			System.out.println("TestClient end");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
