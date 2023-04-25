package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.laptop.laptop;
import com.example.demo.repository.laptoprepo;

@Service
public class laptopservice {
	@Autowired
	public laptoprepo lap;
	public laptop saveInfo(laptop op)
	{
		return lap.save(op);
	}
public List<laptop> getDetails()
{
	return lap.findAll();
}
public laptop updateInfo(laptop ap)
{
	return lap.saveAndFlush(ap);
}
public void deleteInfo(int LId)
{
	lap.deleteById(LId);
}
}
