package com.example.emberdata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.emberdata.model.UserModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmberDataService implements EmberData{

	ObjectMapper objectMapper = new ObjectMapper();
	
	@Override
	public String getUser() {
		UserModel user1 = new UserModel();
		user1.setId(1);
		user1.setUserName("Digvijay Sonak");
		user1.setUserAge(28);
		user1.setUserId("118118");
		
		UserModel user2 = new UserModel();
		user2.setId(2);
		user2.setUserName("Deepali Shende");
		user2.setUserAge(27);
		user2.setUserId("118118");
		
		List<UserModel> listOfUsers = new ArrayList<>();
		listOfUsers.add(user1);
		listOfUsers.add(user2);
		try {
			return objectMapper.writeValueAsString(listOfUsers);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "Error";
	}

	@Override
	public String createUser() {
		return "user created";
	}

	@Override
	public String updateUser() {
		return "user updated";
	}

	@Override
	public String deleteUser() {
		return "user deleted";
	}

	
}
