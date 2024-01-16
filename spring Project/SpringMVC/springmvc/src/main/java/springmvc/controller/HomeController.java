package springmvc.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("/home") this done without model 
//	public String home()
//	{
//		System.out.println("this is home url");
//		return "index";
//	}
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("this is home url");
		model.addAttribute("name", "Aniket Ranjan");
		
		List<String> friends = new ArrayList<String>();
		friends.add("saloni");
		friends.add("muskan");
		friends.add("mariya");
		friends.add("joyti");
		
		model.addAttribute("f", friends);
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about home url");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is help controller");
		//creating modelandview object
		ModelAndView modelandview = new ModelAndView();
		//setting data using modelandview object
		modelandview.addObject("name", "hemlata");
		modelandview.addObject("rollno", 142708231);
		return modelandview;
	}

}
