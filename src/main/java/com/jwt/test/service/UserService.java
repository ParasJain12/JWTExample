package com.jwt.test.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.test.model.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Paras Jain","paras@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ojas sharma","ojas@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Manas Rathore","manas@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.store;
	}
}
