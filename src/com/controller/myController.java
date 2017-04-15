package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jdbcTemplates.Student;
import com.service.MyManager;
 
@Controller
@RequestMapping("/firstSpringTest")
public class myController{
	@Autowired
	private MyManager myManager;
   @RequestMapping(method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework! 2222");
      System.out.println("Hello Spring MVC Framework! 2222");
      return "firstSpring";
   }
   
   @RequestMapping(value={"/getUser","/getUser/","/getStudent"},method = RequestMethod.GET)
   public String getUser(@RequestParam Map<String,String> requestParams,ModelMap model) {
      //model.addAttribute("message", "Hello Spring MVC Framework! getUser");
      //myManager.fun();
	  Student student= myManager.getUser(new Integer(requestParams.get("id")));
	  model.addAttribute("student", student);
      System.out.println("getUser ID:"+requestParams.get("id"));
      System.out.println("Name:"+student.getName());
      
      return "updateUser";
   }
   //http://localhost:8082/mySpring/firstSpringTest/getUserList/
   @RequestMapping(value="/getUserList",method=RequestMethod.GET )
   public String getUserList(ModelMap model){
	   List<Student> lstUser=myManager.getUserList();
	   model.addAttribute("userList", lstUser);
	   return "userList";
   }
   @RequestMapping(value="/delete", method=RequestMethod.GET)
   public String deleteUser(ModelMap model,@RequestParam Integer id){
	   Student student=new Student();
	   student.setId(id);
	   myManager.deleteUser(student);
	   List<Student> lstUser=myManager.getUserList();
	   model.addAttribute("userList", lstUser);
	   System.out.println("@PathVariable ID: "+id);
	   return "userList";
   }
   /*
    * Unfortunately FormHttpMessageConverter (which is used for @RequestBody-annotated parameters when content type is application/x-www-form-urlencoded) cannot bind target classes (as @ModelAttribute can).

		Therefore you need @ModelAttribute instead of @RequestBody. If you don't need to pass different content types to that method you can simply replace the annotation:
		
		@RequestMapping(method = RequestMethod.POST)
		public ModelAndView create(@ModelAttribute UserAccountBean account) { ... }
		Otherwise I guess you can create a separate method form processing form data with the appropriate headers attribute:
		
		@RequestMapping(method = RequestMethod.POST, 
		    headers = "content-type=application/x-www-form-urlencoded") 
		public ModelAndView createFromForm(@ModelAttribute UserAccountBean account) { ... }
		EDIT: Another possible option is to implement your own HttpMessageConverter by combining FormHttpMessageConverter (to convert input message to the map of parameters) and WebDataBinder (to convert map of parameters to the target object).
    */
   @RequestMapping(value="/updateUser", method=RequestMethod.POST)
   public String updateUser(ModelMap model,@ModelAttribute Student student){
	   //Student student=new Student();
	   //student.setId(id);
	   myManager.updateUser(student);
	   List<Student> lstUser=myManager.getUserList();
	   model.addAttribute("userList", lstUser);
	   System.out.println("@ModelAttribute ID: "+student.getId()+"  Age: "+student.getAge()+" Name: "+student.getName());
	   return "userList";
   }
   @RequestMapping(value="/newUser", method=RequestMethod.GET)
   public String newUser(){
	   
	   return "newUser";
   }
   @RequestMapping(value="saveUser",method=RequestMethod.POST)
   public String saveUser(ModelMap model,@ModelAttribute final Student student){
	   myManager.saveUser(student);
	   List<Student> lstUser=myManager.getUserList();
	   model.addAttribute("userList", lstUser);
	   
	   return "userList";
   }
}