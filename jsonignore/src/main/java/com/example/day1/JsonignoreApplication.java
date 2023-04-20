package com.example.day1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonignoreApplication {

	public static void main(String[] args)
	throws JsonProcessingException{
		SpringApplication.run(JsonignoreApplication.class, args);
		json1 p=new json1(1,"moni",22);
				ObjectMapper m=new ObjectMapper();
		String json=m.writeValueAsString(p);
		System.out.println(json);
		
	}

}
