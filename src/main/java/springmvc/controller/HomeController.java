package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("name","khan");
		model.addAttribute("id", 1234);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Asgharul Obaid");
		friends.add("Shabbu");
		friends.add("Balaipur");
		model.addAttribute("f",friends);
		
		System.out.println("this is home url");
		return "index";	
		
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about";
	}
	@RequestMapping("/services")
	public String services() {
		System.out.println("this is our services");
		return"services";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("how can we help you");
		
		//create model and object
		ModelAndView modelAndView=new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Obaid khan");
		modelAndView.addObject("rollnumber", 234567);
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(123);
		list.add(1234);
		list.add(12345);
		modelAndView.addObject("marks", list);
		
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
}
