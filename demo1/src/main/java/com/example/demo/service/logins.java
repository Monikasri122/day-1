package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.laptop.loginpg;
import com.example.demo.repository.loginrepo;

@Service
public class logins {
		@Autowired
	loginrepo lrep;
	public loginpg saveLogin(loginpg u)
	{
	  return lrep.save(u);
	}
	public String validateUser(String username,String password)
	{
		String result="";
		loginpg u=lrep.findByUsername(username);
		if(u==null)
		{
			result="Invalid user";
		}
			else
			{
				if(u.getPassword().equals(password))
				{
					result="Login success";
				}
				else
				{
					result="Login failed";
				}
			}
	       	return result;
		}
		
		
		}




	

	
