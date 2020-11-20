package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.UserGroup;
import com.example.demo.repository.UserGroupRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserGroupRepository userGroupRepository;

	@Override
	public User findByUserId(int userId) {
		return userRepository.findById(userId).get();
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public List<UserGroup> findByGroupId(int groupId) {
		return userGroupRepository.findByGroupId(groupId);
	}
}
