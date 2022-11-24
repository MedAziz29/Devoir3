package com.aziz.users.service;

import com.aziz.users.entities.Role;
import com.aziz.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
