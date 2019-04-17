package com.example.emberdata.service;

import org.springframework.stereotype.Service;

@Service
public interface EmberData {

	public String getUser();
	public String createUser();
	public String updateUser();
	public String deleteUser();
}
