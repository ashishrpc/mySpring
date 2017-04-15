package com.developersBook.springExample.serviceImpl;

import com.developersBook.springExample.domain.Name;
import com.developersBook.springExample.service.HelloService;

public class HelloServiceImpl implements HelloService {

	public String sayHello(Name name) {

		return "Hello  " + name.getFirstName() + " " + name.getLastName();
	}

}
