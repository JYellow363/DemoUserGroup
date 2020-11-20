package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.GroupService;

@Controller
@RequestMapping("/group")
public class GroupController {
	@Autowired
	GroupService groupService;
	
	@RequestMapping("/")
	public String goListProducts(Map<String, Object> model) {
		model.put("listGroup", groupService.findAll());
		return "listGroup";
	}
	
	@RequestMapping("/listGroup")
	public String listProducts(Map<String, Object> model) {
		model.put("listGroup", groupService.findAll());
		return "listGroup";
	}
	
	@RequestMapping("/searchByUserId")
	public String searchByUserId(Map<String, Object> model, @ModelAttribute(value = "user") User user) {
		model.put("listGroup", groupService.findByUserId(user.getId()));
		return "searchByUserId";
	}
}
