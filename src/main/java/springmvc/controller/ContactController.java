package springmvc.controller;

import java.lang.ProcessBuilder.Redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
		@Autowired
	 	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "learn code with team");
		m.addAttribute("Desc", "Home for programmer");
		System.out.println("adding common data to model");
	}

	@RequestMapping("/contact")
	public String showForm(Model m) {
		
		return "contact";
	}

	@RequestMapping("/processform")
	public String handleForm(@ModelAttribute("user") User user, Model model) {
		
		System.out.println(user);
		if(user.getUserName().isEmpty()) {
			return "Redirect:/contact";
		}
		
		int createdUser=this.userService.createUser(user);
		model.addAttribute("msg","user created with id" +createdUser);
		return "success";
	}

}

//manually worked without method addAttributes
/*
 * @RequestMapping(path = "/processform",method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam("email") String userEmail,
 * 
 * @RequestParam("userName") String userName,
 * 
 * @RequestParam("password") String userPassword, Model model) {
 * 
 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
 * user.setPassword(userPassword); System.out.println(user);
 * 
 * // System.out.println("user email" + userEmail); //
 * System.out.println("user name" + userName); //
 * System.out.println("user password" + userPassword);
 * 
 * 
 * // model.addAttribute("name",userName); //model.addAttribute("email",
 * userEmail); //model.addAttribute("password", userPassword);
 * 
 * model.addAttribute("user",user); return "success"; }
 */