package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.beans.LoginVO;
import com.validator.LoginValidator;


@Controller
@RequestMapping(value="/login")
public class Login {
	
	@Autowired
	LoginValidator loginValidator;
	
	@RequestMapping(value="/loginInit", method=RequestMethod.GET)
	public ModelAndView loginInit(ModelMap model){
		System.out.println("loginInit.....");
		return new ModelAndView("login","command",new LoginVO());
	}
	@RequestMapping(value="/loginCheck", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("SpringWeb") LoginVO loginVO,BindingResult result, ModelMap model){
		loginValidator.validate(loginVO, result);
		if(result.hasErrors()){
			return new ModelAndView("login","command",loginVO); 
		}
		model.put("login", loginVO.getLogin());
		model.put("message", "Success login!!!!!");
		return new ModelAndView("success","command",loginVO);//"success";
	}
}
