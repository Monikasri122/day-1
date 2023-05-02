package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.laptop.loginpg;
import com.example.demo.service.logins;

@RestController
public class loginc {
	@Autowired
	 logins ls;
	@PostMapping("/checkLogin")
		public String validateUser(@RequestBody loginpg u)
		{
		System.out.println(u.getUsername());
			return ls.validateUser(u.getUsername(),u.getPassword());
		}
	@PostMapping("/addUser")
	public Object loginpg (@RequestBody loginpg u)
	{
	return ls.saveLogin(u);
	}
	
	}


