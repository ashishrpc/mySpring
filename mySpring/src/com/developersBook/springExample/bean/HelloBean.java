package com.developersBook.springExample.bean;

import java.util.Calendar;

import com.developersBook.springExample.domain.Name;
import com.developersBook.springExample.service.ByeService;
import com.developersBook.springExample.service.HelloService;

public class HelloBean {
	
	public Name name;
	public HelloService helloService;
	public ByeService byeService;
	//---------------------------------------------- Getters & Setters
	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
	
	public void setByeService(ByeService byeService) {
		this.byeService = byeService;
	}
	
	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	//---------------------------------------------- domain methods
	
	public String wishMe(Name name) {
		Calendar calendar = Calendar.getInstance();
		//simple if to check the time
		if(calendar.get(Calendar.HOUR_OF_DAY) <  12){
			return helloService.sayHello(name);
		} else {
			return byeService.sayBye(name);
		}
	}

}
