package com.example.emberdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.emberdata.service.EmberData;

@Controller
@CrossOrigin
public class EmberDataController {
	
	@Autowired
	private EmberData emberData;

	@RequestMapping(value="/getall")
	public @ResponseBody String getUser() {
		return emberData.getUser();
	}
	
	@RequestMapping(value="/createuser")
	public String createUser() {
		return emberData.createUser();
	}
	
	@RequestMapping(value="/updateuser")
	public String updateUser() {
		return emberData.updateUser();
	}
	
	@RequestMapping(value="/deleteuser")
	public String deleteUser() {
		return emberData.deleteUser();
	}
}
