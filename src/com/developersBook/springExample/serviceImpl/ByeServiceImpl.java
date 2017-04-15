package com.developersBook.springExample.serviceImpl;

import com.developersBook.springExample.domain.Name;
import com.developersBook.springExample.service.ByeService;

public class ByeServiceImpl implements ByeService {

	public String sayBye(Name name) {
		return "Bye " + name.getFirstName() + " " + name.getLastName();
	}

}
