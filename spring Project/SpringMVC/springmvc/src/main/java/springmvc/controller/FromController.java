package springmvc.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.user;
import springmvc.service.userservice;



@Controller
public class FromController {
	
	@Autowired
	private userservice userservice;
	@RequestMapping("/From")
	public String showfrom()
	{
		return "From";
	}
	
// it is done by ModelAttribute 
	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute user user , Model model)
	{
		
		System.out.println(user);
		//model.addAttribute("user" , user);
		this.userservice.createuser(user);
		
		//System.out.println(user);
		return "Success";
	}

//this done by creating a pojo calss by the name of user after that creating an object of user
//	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
//	public String handleForm(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
//			@RequestParam("number") String number,
//			@RequestParam("exampleInputEmail1") String exampleInputEmail1,
//			@RequestParam("username") String username,
//			@RequestParam("Password") String Password , Model model)
//	{
//		
//		user user = new user();
//		user.setFirstname(firstname);
//		user.setLastname(lastname);
//		user.setNumber(number);
//		user.setExampleInputEmail1(exampleInputEmail1);
//		user.setUsername(username);
//		user.setPassword(Password);
////		
//		model.addAttribute("user" , user);
//		
//		
//		System.out.println(user);
//		return "Success";
//	}
	
//this is done by using model 	
//	@RequestMapping(path = "/processform" , method = RequestMethod.POST)
//	public String handleForm(@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,
//			@RequestParam("number") String number,
//			@RequestParam("exampleInputEmail1") String exampleInputEmail1,
//			@RequestParam("username") String username,
//			@RequestParam("Password") String Password , Model model)
//	{
//		
		
//		model.addAttribute("firstname" , firstname);
//		model.addAttribute("exampleInputEmail1" , exampleInputEmail1);
//		
//		System.out.println(firstname);
//		System.out.println(lastname);
//		System.out.println(number);
//		System.out.println(exampleInputEmail1);
//		System.out.println(username);
//		System.out.println(Password);
//		return "Success";
//	}

}
