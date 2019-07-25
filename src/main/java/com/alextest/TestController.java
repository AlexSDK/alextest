package com.alextest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("test")
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/get")
	@ResponseBody
	public String getTest() {
		try {
			
			return "success";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}
	
}