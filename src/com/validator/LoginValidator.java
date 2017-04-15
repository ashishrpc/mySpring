package com.validator;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.beans.LoginVO;
public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return LoginVO.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors arg1) {
		// TODO Auto-generated method stub
		ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "login", "error.login", "Login is mandatory and not accept white space.");
		ValidationUtils.rejectIfEmpty(arg1, "password", "error.password", "Password is mandatory field.");
		
		
	}

}
