package com.ekart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ekart.dao.RegisterDao;
import com.ekart.model.Register;

@Controller
public class Ekart {
	@Autowired
	RegisterDao registerdao;
	@RequestMapping ("/")
	public String index()
	{
		System.out.println("index called");
		return "index";
	}
	@RequestMapping ("/login")
	public String login()
	{
		System.out.println("login called");
		return "login";
	}
	@RequestMapping ("/register")
	public ModelAndView register()
	{
		System.out.println("register called");
		Register reg=new Register();
		return new ModelAndView("register","reg",reg);
	
	}
	@RequestMapping ("/registerUser")
	public String registerUser(@ModelAttribute("reg")Register register)
	{
		System.out.println("registerUser called");
		registerdao.registeruser(register);
		
		return "registerUser";
	}  

}
