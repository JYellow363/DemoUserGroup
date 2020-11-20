package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Group;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String goListProducts(Map<String, Object> model) {
		model.put("listUser", userService.findAll());
		return "listUser";
	}
	
	@RequestMapping("/listUser")
	public String listProducts(Map<String, Object> model) {
		model.put("listUser", userService.findAll());
		return "listUser";
	}
	
	@RequestMapping("/searchByGroupId")
	public String searchByGroupId(Map<String, Object> model, @ModelAttribute(value = "group") Group group) {
		model.put("listUser", userService.findByGroupId(group.getId()));
		return "searchByGroupId";
	}
}
