package com.example.demo.Controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.laptop.laptop;
import com.example.demo.service.laptopservice;

public class laptopcontroller {
	@Autowired
	laptopservice lscr;
	
	@PostMapping("/glaptop")
	public laptop addDetails(@RequestBody laptop lt)
	{
		return lscr.saveInfo(lt);
	}
	@GetMapping("/getlaptop")
	public List<laptop> getDetails()
	{
		return lscr.getDetails();
	}
	@PutMapping("/updatelaptop")
	public laptop updateDetails(@RequestBody laptop lts)
	{
		return lscr.updateInfo(lts);
	}
	@DeleteMapping("deletelaptop/{company}")
	public String deleteDetails(@PathVariable("LaptopId")int lid)
	{
		lscr.deleteInfo(lid);
		return "laptop"+lid+"deleted";
	}
}
