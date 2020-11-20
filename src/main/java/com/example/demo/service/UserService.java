package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.model.UserGroup;

public interface UserService {
	User findByUserId(int userId);
	List<User> findAll();
	List<UserGroup> findByGroupId(int groupId);
}
