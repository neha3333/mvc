package com.springonemvcone;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingPageController {

	@RequestMapping(path="/greet.do", method=RequestMethod.GET)
	public String greet(@RequestParam("name")String nm, Model model)
	{
		String msg="Hello World";
		model.addAttribute("msg",msg);
		model.addAttribute("name",nm);
		return "greetPage";
	}
}