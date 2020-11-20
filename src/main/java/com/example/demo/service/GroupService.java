package com.example.demo.service;

import java.util.List;
import com.example.demo.model.Group;
import com.example.demo.model.UserGroup;

public interface GroupService {
	Group findByGroupId(int groupId);
	List<Group> findAll();
	List<UserGroup> findByUserId(int userId);
}
