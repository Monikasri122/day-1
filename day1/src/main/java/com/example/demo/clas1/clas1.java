package com.example.demo.clas1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class clas1 {
	 @RequestMapping("/moni")
	 @ResponseBody
public String clas1()
{
	return "Hi";
}
}

