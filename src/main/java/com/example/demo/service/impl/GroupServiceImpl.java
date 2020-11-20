package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Group;
import com.example.demo.model.UserGroup;
import com.example.demo.repository.GroupRepository;
import com.example.demo.repository.UserGroupRepository;
import com.example.demo.service.GroupService;

@Service
public class GroupServiceImpl implements GroupService {
	
	@Autowired
	GroupRepository groupRepository;
	
	@Autowired
	UserGroupRepository userGroupRepository;

	@Override
	public Group findByGroupId(int groupId) {
		return groupRepository.findById(groupId).get();
	}

	@Override
	public List<Group> findAll() {
		return groupRepository.findAll();
	}

	@Override
	public List<UserGroup> findByUserId(int userId) {
		return userGroupRepository.findByUserId(userId);
	}
}
