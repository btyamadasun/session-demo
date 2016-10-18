package com.example.session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	@RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
	public String redirect(){
		return "redirect:session";
	}
	@RequestMapping(value = "/session", method = {RequestMethod.GET, RequestMethod.POST})
	public String hello(){
		return "session/index";
	}
}
